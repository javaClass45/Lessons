package annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        var declaredAnnotations = HelloAnnotationExercise.class.getDeclaredAnnotations();
        System.out.println(Arrays.toString(declaredAnnotations));

        var exercise = HelloAnnotationExercise.class.getDeclaredAnnotation(Exercise.class);
        var value = exercise.value();
        var level = exercise.complexityLevel();
        System.out.println(exercise + " - " + level);
    }
}
