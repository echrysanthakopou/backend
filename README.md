# Pension App Backend

Η εφαρμογή αυτή αναπτύχθηκε στα πλαίσια μια εργασίας, για εκπαιδευτικούς σκοπούς.

Το σύστημα θα επέτρεπε στο χρήστη να υποβάλλει ένα αίτημα σύνταξης.

Το συγκεκρίμενο  repository αφόρα το backend κομμάτι που εξυπήρετει το frontend 
καθώς αναλαμβάνει την επικοινωνία με τη βάση δεδόμενων. 
Το σύστημα αυτόματα θα συνδέθει με την βάση και θα δημιουργήσει το σχήμα αν αυτό δεν υπάρχει.
Κάτα την διάρκεια της λειτούργιας έχει ένα κατάλληλο API για να υποστηρίξει την λειτουργία του site.


## Installation

Αφού κατεβάσετε την εφαρμογή θα πρέπει να εκτελέστουν τα ακόλουθα βήματα.	

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

Οποιοσδήποτε θέλει να συνεισφέρει στο παρόν project είναι ευπρόσδεκτος.

## Email

....

## License
[MIT](https://choosealicense.com/licenses/mit/)
