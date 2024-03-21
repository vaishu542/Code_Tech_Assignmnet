import java.util.ArrayList;
import java.util.List;

public class Q10 {
    private static List<String> classPath = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ClassPathManager <operation> [path]");
            return;
        }

        String operation = args[0];

        switch (operation) {
            case "set":
                if (args.length != 2) {
                    System.out.println("Usage: java ClassPathManager set <path>");
                    return;
                }
                setClassPath(args[1]);
                break;
            case "add":
                if (args.length != 2) {
                    System.out.println("Usage: java ClassPathManager add <path>");
                    return;
                }
                addClassPath(args[1]);
                break;
            case "print":
                printClassPath();
                break;
            default:
                System.out.println("Invalid operation. Valid operations: set, add, print");
        }
    }

    private static void setClassPath(String newPath) {
        classPath.clear();
        classPath.add(newPath);
        System.out.println("CLASSPATH set to: " + newPath);
    }

    private static void addClassPath(String newPath) {
        classPath.add(newPath);
        System.out.println("New path added to CLASSPATH: " + newPath);
    }

    private static void printClassPath() {
        if (classPath.isEmpty()) {
            System.out.println("CLASSPATH is empty.");
        } else {
            System.out.println("Current CLASSPATH:");
            for (String path : classPath) {
                System.out.println(path);
            }
        }
    }
}
