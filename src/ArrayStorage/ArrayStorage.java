package ArrayStorage;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        /*for (int i = 0; i < size ; i++){
            storage[i] = null;
        }
        size = 0;*/
        Arrays.fill(storage, 0,size,null);
        size = 0;
    }

    void save(Resume r) {
        boolean indicator = true;
        for (int i = 0; i < size ; i++){
            if(storage[i] == r){
                indicator = false;
                System.out.println("Ошибка: такое резюме уже есть в хранилище");
            }
        }
        if(size != 10000) {
            storage[size] = r;
            size++;
        } else {
            System.out.println("Ошибка: в хранилище нет места");
        }
    }

    void update(Resume r) {
        if(checkForErrors(r)) {
            for (int i = 0; i < size; i++) {
                if (storage[i] == r) {
                    storage[i].setUuid(r.getUuid());
                }
            }
        }
    }
   Resume get(String uuid) {
       if(checkForErrors(uuid)) {
           for (int i = 0; i < size; i++) {
               if (uuid.equals(storage[i].getUuid())) {
                   return storage[i];
               }
           }
       }
       return null;
    }

    void delete(String uuid) {
        if(checkForErrors(uuid)) {
            for (int i = 0; i < size; i++) {
                if (uuid.equals(storage[i].getUuid())) {
                    for (int j = i; j < size; j++) {
                        storage[j] = storage[j + 1];
                    }
                    size--;
                }
            }
        }
    }

    boolean checkForErrors(Resume r){
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (storage[i] == r){
                result = true;
                break;
            }
        }
        if (result == false){
            System.out.println("Ошибка: такого резюме нет в хранилище");
        }
        return result;
    }


    boolean checkForErrors(String uuid){
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid() == uuid){
                result = true;
                break;
            }
        }
        if (result == false){
            System.out.println("Ошибка: такого резюме нет в хранилище");
        }
        return result;
    }

    /**
     * @return array, contains only Resumles in storage (without null)
     */
    Resume[] getAll() {
        /*Resume[]  allResumes = new Resume[size];
        for (int i = 0; i < size ; i++){
            allResumes[i] = storage[i];
        }*/
        Resume[] allResumes = Arrays.copyOfRange(storage,0,size);
        return  allResumes;
    }

    int size() {
        return size;
    }
}
