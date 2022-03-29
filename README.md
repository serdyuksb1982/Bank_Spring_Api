# Bank_Spring_Api
https://github.com/serdyuksb1982/Bank_Api_Spring
29.03.2022г. Api Bank.
Изучаю Spring Boot.
Очень простое Web Api, имитация банковского приложения RESTfull.
Не используется База данных, данные хранятся в HashMap.
TransferBalance слой модели с тремя полями, необходим для осуществления расчетов.
Repository, заменяет DAO, используя HashMap<Long, BigDecimal). Функционально выполяет методы get (получить данные) и save (сохранить).
Слой BankService содержит бизнесс логику с методами getBalance, AddMoney, makeTransfer.
Один контроллер иньекция зависимостей через конструктор (в помощь Lombook) с Post и Get методами и ExceptionHandler,  на случай IllegalArgumentException.
Добавлено два UnitTest на слой сервиса, бизнесс логики.
Все просто.
