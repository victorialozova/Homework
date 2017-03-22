package DifferentTypeArray;

/**
 * Написать класс, который умеет хранить в себе массив
 * любых типов данных (int, long etc.). Реализовать метод,
 * который возвращает любой элемент массива по индексу
 */
public class MainDif {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] stringArray = {"a", "b", "c", "d", "e"};
        DifferentTypeArray<Integer> intArr = new DifferentTypeArray<Integer>(intArray.length);
        DifferentTypeArray<Double> doubleArr = new DifferentTypeArray<Double>(doubleArray.length);
        DifferentTypeArray<String> stringArr = new DifferentTypeArray<String>(stringArray.length);
        for (int i = 0; i < intArray.length; i++) {
            intArr.setElem(intArray[i], i);
        }
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArr.setElem(doubleArray[i], i);
        }
        for (int i = 0; i < stringArray.length; i++) {
            stringArr.setElem(stringArray[i], i);
        }
        System.out.println(intArr.getElem(2));
        System.out.println(doubleArr.getElem(1));
        System.out.println(stringArr.getElem(3));
    }
}
