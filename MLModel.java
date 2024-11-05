import weka.classifiers.Classifier;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;

public class MLModel {
    private Classifier model;

    public MLModel(String modelPath) throws Exception {
        model = (Classifier) SerializationHelper.read(modelPath);
    }

    public double predictQuality(CodeMetrics metrics) throws Exception {
        // Convert CodeMetrics into an Instance object for prediction
        Instance instance = metrics.toInstance();
        return model.classifyInstance(instance);
    }
}
