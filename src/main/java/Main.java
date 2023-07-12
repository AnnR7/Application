public class Main {
    public static void main (String[] args) {

        Post post = new Post(); // объект запроса
        post.name = "Иван"; // поля объекта
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate(); // объект формата даты
        post.birthday.day = 13; // поля формата даты
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
