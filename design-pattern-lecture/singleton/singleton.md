### Singleton

- resource
    - js singleton code = https://monsterlessons.com/project/lessons/singleton-pattiern-v-javascript
    - wiki - https://refactoring.guru/design-patterns/singleton
    - other resources - [resources.md](..%2Fresources.md)


- **Вид паттерна**
    - порождающий (Creational)


- **Основа**
    - Класс должен иметь только один экземпляр и возращать только его
    - Гарантирует наличие единственного экземпляра класса.
    - Должна быть глобальная точка доступа к этому эеземпляру
    - Предоставляет глобальную точку доступа.


- **Где использовать ?**
    - Shared resources
    - Database
    - Cache
    - file
    - Logger
    - Access to API(Wi-Fi, bluetooth, NFC)


- **Реализация OOP**
    - Нужно заблокировать все внешние точки для создания экземпляра
        - Сделать constructor приватным
        - Если есть методы которые могут создать новый экземпляр через привытный конструктор,
          сделать эти методы приватными.
    - Нужно создать Статическую невидоизменяемую переменную где будет присвоен экземпляр.
    - Нужно создать публичный статический метод который будет возвращать статическую переменную где
      присвоен экзмепляр. Если напрямую обращаться к статической переменной то ей могут присвоить
      другое значение.Поэтому обращаемся через статический метод к статической переменной.
    - Как создавать Экземпляр какие метаданные нужно принимать и тд это уже на вкус разработчика.


- **Реализация Functional language**
    - Нужно заблокировать все внешние точки для создания экземпляра
        - Функция который создает экземпляр сделать анонимным, сразу вызвать и присвоить к
          глобальной невидоизменяемой переменной
        - Анонимная функция должна содержать внутри локальные функции. Анонимная функция должна
          возвращать новый объект где
          будут содержать эти локальные функции как методы объекта и это будет служить как Экземпляр
        - Экзмепляр в функциональном программировании это и есть обычный объект.


- Code

```java

class Database {

  private static Database database = new Database();

  private Database() {

  }

  private Database createDatabase() {
    // some logic
    return new Database();
  }

  public void doSomething() {

  }

  public static Database getInstance() {
    if (database == null) {
      database = createDatabase();
    }
    return database;
  }

}

class Application {

  public static void main(String[] args) {
    Database.getInstance().doSomething();
  }

}


```



