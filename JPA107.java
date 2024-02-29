public class JPA107 {
    public static void main(String[] args) {
        // 創建 Basketball 類別的物件
        Basketball basketballInstance = new Basketball();
        // 呼叫 calculateGrade 方法取得籃球分數
        int basketballGrade = basketballInstance.calculateGrade();
        // 輸出籃球分數
        System.out.println("The basketball grade is " + basketballGrade);

        // 創建 Baseball 類別的物件
        Baseball baseballInstance = new Baseball();
        // 呼叫 calculateGrade 方法取得棒球分數
        int baseballGrade = baseballInstance.calculateGrade();
        // 輸出棒球分數
        System.out.println("The baseball grade is " + baseballGrade);
    }
}

class Basketball {
    int action = 1;
    int skill = 2;
    int teamGame = 3;

    int calculateGrade() {
        return 10 + skill + teamGame;
    }
}

class Baseball {
    int action = 1;
    int skill = 2;
    int teamGame = 3;

    int calculateGrade() {
        return action + skill + teamGame;
    }
}
