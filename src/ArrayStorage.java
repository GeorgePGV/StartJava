

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        for (int i = 0; i < size ; i++){
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        Resume r = new Resume();
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                r = storage[i];
            }
        }
        return r;
    }

    void delete(String uuid) {
        for (int i = 0; i <= size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                for (int g = i + 1; g <= size; g++) {
                    storage[g] = storage[g - 1];
                }
            }
        }
        size--;
    }

    /**
     * @return array, contains only Resumles in storage (without null)
     */
    Resume[] getAll() {
        Resume[] copyOfStorage = new Resume[size];
        for (int i = 0; i < size ; i++){
            copyOfStorage[i] = storage[i];
        }
        return copyOfStorage;
    }

    int size() {
        return size;
    }
}
