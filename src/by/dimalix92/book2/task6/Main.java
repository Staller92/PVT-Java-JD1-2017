package by.dimalix92.book2.task6;

/**
 * Created by LIKHTAROVICH on 27.08.2017.
 * Создать простейщий логгер, выводящий сообщения об ошибках в текстовый файл.
 * Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть
 * обязательным один метод, получающий на вход текст сообщения об ощибке и записывающий его в файл
 * вместе информацией о дате проишествия.
 */
class Main {
    public static void main(String[] args) {
        Log log = Log.getLog();
        log.logger("File not found");
        log.logger("Fatal error");
        log.logger("Something went wrong");
        log.logger("Houston, we have a problem");

    }

}
