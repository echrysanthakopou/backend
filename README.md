# Pension App Backend

Η εφαρμογή αυτή αναπτύχθηκε στα πλαίσια μια εργασίας, για εκπαιδευτικούς σκοπούς.

Το σύστημα θα επέτρεπε στο χρήστη να υποβάλλει ένα αιτήμα συνταξη.

Το συγκεκρίμενο  repository αφόρα το backend κομμάτι που εξυπήρετει το frontend 
αλλά και ανάλαμβάνει την επικοινωνία με τη βάση δεδόμενων. 
Το σύστημα αυτόματα θα συνδέθει με την βάση και θα δημιουργήσει το σχήμα αν αυτό δεν υπάρχει.
Κάτα την διάρκεια τις λειτούργιας θα έχει ένα κατάλληλο API για να υποστηρίζει την λείτουργια του site.


## Installation

Αφού κατεβάσετε την εφαρμογή θα πρέπει αν εκτέλεστουν τα ακολούθα βήματα.	

```bash

mvn clean
mvn clean install
docker build -t server .
docker pull mysql/mysql-server:latest

```

## Usage

With docker 

```bash

docker run --name=sql -d mysql/mysql-server:latest

docker run server   JAR_FILE=target/*.jar
```



## Contributing

Οποιοδήποτε θα ήθελα να συνεισφέρει στο παρόν project είναι ευπρόσδεκτH.



## License
[MIT](https://choosealicense.com/licenses/mit/)
