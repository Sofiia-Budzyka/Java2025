import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        // 1
        java.util.ArrayList<String> colors = new java.util.ArrayList<>();
        colors.add("Червоний");
        colors.add("Зелений");
        colors.add("Синій");
        colors.add("Білий");
        colors.add("Чорний");
        System.out.println("Початковий список: " + colors);
        //2
        System.out.print("2. Ітерація через for-each: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        //3
        colors.add(0, "Жовтий");
        System.out.println("3. Після вставки 'Жовтий' на початок: " + colors);
        //4
        String elementAtIndex = colors.get(2);
        System.out.println("4. Елемент під індексом 2: " + elementAtIndex);

        //5
        colors.set(1, "Помаранчевий");
        System.out.println("5. Після оновлення індексу 1 на 'Помаранчевий': " + colors);

        //6
        colors.remove(2);
        System.out.println("6. Після видалення 3-го елемента: " + colors);

        //7
        boolean containsBlue = colors.contains("Синій");
        System.out.println("7. Чи містить список 'Синій'? " + containsBlue);
        //8
        Collections.sort(colors);
        System.out.println("8. Відсортований список: " + colors);

        //9
        java.util.ArrayList<String> colorsClone = (java.util.ArrayList<String>) colors.clone();
        System.out.println("9. Склонований список: " + colorsClone);

        //10
        Collections.reverse(colors);
        System.out.println("10. Реверсований список: " + colors);

        //11
        boolean isEqual = colors.equals(colorsClone);
        System.out.println("11. Порівняння оригінального та копії: " + isEqual);

        //12
        colors.clear();
        System.out.println("12. Список очищено методом clear()");

        //13
        boolean isEmpty = colors.isEmpty();
        System.out.println("13. Чи порожній список зараз? " + isEmpty);

        //новий список
        java.util.ArrayList<String> listForSizing = new java.util.ArrayList<>();
        listForSizing.add("A");
        listForSizing.add("B");
        listForSizing.add("C");

        //14
        listForSizing.ensureCapacity(100);
        System.out.println("14. Внутрішню місткість збільшено до 100.");

        //15
        listForSizing.trimToSize();
        System.out.println("15. Місткість обрізано до поточного розміру (trimToSize)." + listForSizing);
    }
}