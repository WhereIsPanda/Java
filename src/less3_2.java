import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class less3_2 {
    //    2. Напишите метод, который определит тип (расширение) файлов из текущей папки
    ////     * и выведет в консоль результат вида
    ////     * 1 Расширение файла: txt
    ////     * 2 Расширение файла: pdf
    ////     * 3 Расширение файла:
    ////            * 4 Расширение файла: jpg
//     */
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("src", "papka");
        System.out.println(file.toAbsolutePath());
        List<Path> direct = Files.list(file).collect(Collectors.toList());
        System.out.println(direct.size());


        for (int i = 0; i < direct.size(); i++) {
            String dw = direct.get(i).toString();
            if (dw.contains(".")) {
                String[] vacx = dw.split("\\.");
                System.out.println("Расширение файла: " + vacx[1]);
            } else {

                System.out.println("Расширение файла: ");
            }


        }


//        Path curr = Path.of("papka");
//        System.out.println(curr);
//        System.out.println(curr.getRoot());
//
////        Path absoluteCurrPath = curr.toAbsolutePath();
////        System.out.println(absoluteCurrPath);
////
////        Path root = absoluteCurrPath.getRoot();
////        System.out.println(root);
//
//        System.out.println(curr.toString().lastIndexOf("."));

//        Path inchestnov = Path.of(root.toString(), "inchestnov");
//        System.out.println(inchestnov.toString());

    }

}


