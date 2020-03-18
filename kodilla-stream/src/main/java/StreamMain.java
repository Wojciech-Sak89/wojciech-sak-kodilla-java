import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();

//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));

//        System.out.println("Calculating expressions with lambdas");
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("pretty text", (a) -> a.toUpperCase());
        poemBeautifier.beautify("alfabetINeed!!!", (a) -> "ABC " + a + " ABC");
        poemBeautifier.beautify("CAPS TEXT", (a) -> a.toLowerCase());
        poemBeautifier.beautify("I DON'T NEED ANY \"A\" LETTERS!!! I NEED \"B\" INSTEAD", (a) -> a.replaceAll("A", "B"));
    }
}
