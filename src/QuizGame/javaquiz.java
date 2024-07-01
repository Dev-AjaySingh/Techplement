package QuizGame;


import java.util.ArrayList;
import java.util.Scanner;

class javaquiz
{
    //public static Map<String, Quiz> map=new HashMap();

    Scanner obj=new Scanner(System.in);
    public void createquiz() {
        System.out.println("Enter the name of Quiz: ");
        String quizname = obj.next();
        System.out.println("Quiz Created");

        System.out.println("how many questions you want to add");
        int quesnumber = obj.nextInt();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> option = new ArrayList<>();
        System.out.println("Enter question");

        for (int i = 0; i <= quesnumber; i++) {
            list.add(obj.nextLine());
        }
        System.out.println("Question Added");

        System.out.println("The Question are: " + list);

    }


    public void addquestion()
    {
        System.out.println("Question Added");
    }

    public void play()
    {
        System.out.println("Playing..");
        int score=0;

        char [] correctans={'a','b','a','b','a','a'};
        String[] questions=
                {       "1. Who is the PM of india?\n"+" a) Narendra Modi \n b) Amit shah",
                        "2. What is the capital of India?\n a) Lucknow \n b) New Delhi",
                        "3. What is Java?\n"+" a) Programming Language \n b) SQL Query",
                        "4. Where is India Located?\n"+" a) Moon \n b) Earth",
                        "5. Who owns Microsoft?\n"+" a) Bill Gates  \n b) Steve ",
                        "6. What is class ?\n"+" a) Blueprint  \n b) Method",

                };

        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
            char userchoice=obj.next().charAt(0);

            if(userchoice==correctans[i])
            {
                score++;
            }
        }
        System.out.println("Your Score: "+score+" Out of "+ questions.length);
    }


}
class main
{

    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("-------------Welcome to the java Quiz.----------");
        System.out.println("1. Play Default Quiz     2. Add Question       3. Create Quiz");
        int a=obj.nextInt();
        javaquiz q=new javaquiz();
        switch(a)
        {
            case 1:
                q.play();
                break;

            case 2:
                q.addquestion();
                break;

            case 3:
                q.createquiz();
                break;

            default:
                System.out.println("Invalid input");

        }

    }

}
