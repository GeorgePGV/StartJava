

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
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                for (int j = i; j < size; j++) {
                    storage[j] = storage[j + 1];
                }
                size--;
            }
        }
    }

    /**
     * @return array, contains only Resumles in storage (without null)
     */
    Resume[] getAll() {
        Resume[]  allResumes = new Resume[size];
        for (int i = 0; i < size ; i++){
            allResumes[i] = storage[i];
        }
        return  allResumes;
    }

    int size() {
        return size;
    }
}
