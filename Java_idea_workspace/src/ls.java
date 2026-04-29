
public class ls {

    // --- 1. 定义逻辑连接词函数 ---

    // 逻辑与 (AND)
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    // 逻辑或 (OR)
    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    // 逻辑非 (NOT)
    public static boolean not(boolean a) {
        return !a;
    }

    // --- 2. 程序入口点 (这是你缺失的部分) ---

    public static void main(String[] args) {
        System.out.println("开始运行逻辑公式测试...");

        // 测试数据：假设 A=true, B=false, C=true
        boolean A = true;
        boolean B = false;
        boolean C = true;

        // 调用化简后的公式: (A ∧ B) ∨ (A ∧ C) ∨ (B ∧ C)
        // 对应逻辑：(A && B) || (A && C) || (B && C)
        boolean resultSimplified = or(
                or(and(A, B), and(A, C)),
                and(B, C)
        );

        // 调用主析取范式 (PDNF)
        // (¬A ∧ B ∧ C) ∨ (A ∧ ¬B ∧ C) ∨ (A ∧ B ∧ ¬C) ∨ (A ∧ B ∧ C)
        boolean term1 = and(and(not(A), B), C); // ¬A ∧ B ∧ C
        boolean term2 = and(and(A, not(B)), C); // A ∧ ¬B ∧ C
        boolean term3 = and(and(A, B), not(C)); // A ∧ B ∧ ¬C
        boolean term4 = and(and(A, B), C);      // A ∧ B ∧ C

        boolean resultPDNF = or(or(or(term1, term2), term3), term4);

        // 输出结果
        System.out.println("输入: A=" + A + ", B=" + B + ", C=" + C);
        System.out.println("化简公式结果: " + resultSimplified);
        System.out.println("主析取范式结果: " + resultPDNF);

        // 验证两者是否相等
        if (resultSimplified == resultPDNF) {
            System.out.println("验证成功：两个公式逻辑等价！");
        } else {
            System.out.println("验证失败：公式不等价！");
        }
    }
}