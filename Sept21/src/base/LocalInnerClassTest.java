package base;

public class LocalInnerClassTest {

    public static void main(String[] args) {
        LocalInnerClassTest.echo("I like ...");
    }

    public static void echo(String wordYouSay) {
        class Person {
            public void say() {
//                System.out.println(wordYouSay);//jdk7及以下不能通过
            }
        }
        Person person = new Person();
        person.say();
    }

}