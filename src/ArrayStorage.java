

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
        r.setUuid(String.valueOf(size + 1));
        size++;
    }

    Resume get(String uuid) {
        for(int i = 0; i < uuid.length(); i++) {
            if(uuid.charAt(i) >= '0' || uuid.charAt(i) <= '9') {

            }

        }
        return storage[];
    }

    void delete(String uuid) {
       String[] id = uuid.split("d");
        for (int i = Integer.parseInt(uuid); i < size ; i++) {
            storage[Integer.parseInt(uuid) - 1] = storage[Integer.parseInt(uuid)];
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
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
