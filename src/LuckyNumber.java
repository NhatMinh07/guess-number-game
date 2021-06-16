import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) { //hàm main điều chỉnh giá trị max của game
        play(101);
    }
    public static void play(int max){ //hàm play thực thi trò chơi
        Scanner sc = new Scanner(System.in);
        int totalGuess = 0;
        int reportGuess = 0;
        int totalGame = 1;
        int bestGame = 0;
        System.out.println("số lucky number sẽ là một số tự nhiên ngẫu nhiên trong trong khoảng từ 0 tới " + (max-1));
        int luckyNum = (int) (Math.random()*max);
        for(int i = 1; i > 0; i++){ //code của lần chơi đầu tiên
            System.out.print("Your guess? "); int num1 = sc.nextInt();
            totalGuess++;
            if(num1>luckyNum){
                System.out.println("số may mắn nhỏ hơn số dự đoán của bạn.");
            }   else if(num1<luckyNum){
                System.out.println("số may mắn lớn hơn số dự đoán của bạn.");
            }   else{
                System.out.println("chúc mừng bạn đã đoán đúng con số may mắn sau "+ totalGuess +" lần dự đoán");
                reportGuess+=totalGuess;
                bestGame=totalGuess;
                totalGuess=0;
                break;
            }
        }
        do {    //code từ lần chơi thứ 2 đến khi dừng game
            luckyNum = (int) (Math.random()*max);
            System.out.print("bạn có muốn tiếp tục chơi không? "); String ans = sc.next();
            if(ans.equalsIgnoreCase("y")||ans.equalsIgnoreCase("yes")){
                totalGame++;
                for(int i = 1; i > 0; i++){
                    System.out.print("Your guess? "); int num1 = sc.nextInt();
                    totalGuess++;
                    if(num1>luckyNum){
                        System.out.println("số may mắn nhỏ hơn số dự đoán của bạn.");
                    }   else if(num1<luckyNum){
                        System.out.println("số may mắn lớn hơn số dự đoán của bạn.");
                    }   else{
                        System.out.println("chúc mừng bạn đã đoán đúng con số may mắn sau "+ totalGuess +" lần dự đoán");
                        reportGuess+=totalGuess;
                        if(bestGame>totalGuess){
                            bestGame=totalGuess;
                        }
                        totalGuess=0;
                        break;
                    }
                }
            }   else {
                report(totalGame,reportGuess,bestGame);//lệnh gọi ra hàm báo cáo
                break;
            }
        }   while (true);
    }
    public static void report(int totalGame, int reportGuess, int bestGame){ //hàm chứa báo cáo game
        System.out.println();
        System.out.println("kết quả tổng quát của trò chơi");
        System.out.println("tổng số lần chơi   = " + totalGame);
        System.out.println("tổng số lần dự đoán = " + reportGuess);
        System.out.println("số dự đoán trung bình mỗi lượt  = " + (double) reportGuess/totalGame);
        System.out.println("game có số lần dự đoán ít nhất     = " + bestGame);
    }
}
