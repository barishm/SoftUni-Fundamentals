package t6_ObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }


        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int number = Integer.parseInt(scanner.nextLine());
        List<Article> articleList=new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String[] commandLine = scanner.nextLine().split(", ");
            String title = commandLine[0];
            String content =commandLine[1];
            String author=commandLine[2];

            Article article=new Article(title,content,author);

            articleList.add(article);

        }

        String input= scanner.nextLine();


        articleList.forEach(article -> System.out.println(article.toString()));
    }

}
