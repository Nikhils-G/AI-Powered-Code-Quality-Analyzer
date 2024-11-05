public class MainClass {
    public static void main(String[] args) {
        String code = "public class Example { ... }"; // Replace with actual code
        JavaCodeParser parser = new JavaCodeParser();
        parser.parseCode(code);

        CodeAnalysis analysis = new CodeAnalysis();
        analysis.analyze(parser.getParseTree());

        MLModel mlModel = new MLModel("models/trained_model.model");
        double qualityScore = mlModel.predictQuality(analysis.getCodeMetrics());
        System.out.println("Predicted Quality Score: " + qualityScore);

        ComplexityAnalyzer complexityAnalyzer = new ComplexityAnalyzer();
        int complexity = complexityAnalyzer.calculateComplexity(parser.getParseTree());
        System.out.println("Cyclomatic Complexity: " + complexity);
    }
}
