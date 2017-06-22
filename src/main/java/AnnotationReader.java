import java.lang.reflect.Field;

public class AnnotationReader {

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass(new Object());
        Field[] fields = exampleClass.getClass().getDeclaredFields();
        
        for (Field someField : fields) {
            if (someField.isAnnotationPresent(FieldAnnotation.class)) {
                FieldAnnotation fieldAnnotation = someField.getAnnotation(FieldAnnotation.class);
                System.out.println(fieldAnnotation.value());
            }
        }

    }

}
