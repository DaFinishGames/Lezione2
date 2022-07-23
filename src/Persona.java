/**
 * Questa é la definizione di una classe Java.
 * Cos'é una classe Java? Una classe Java é una rappresentazione di un oggetto o elemento ideale.
 * Una classe per esempio puó rappresentare una Persona, una Macchina, un Albero, ma anche concetti astratti
 * come ad esempio GestorePersone: una classe che rappresenta un'entitá astratta che gestisce le Persone.
 * la definizione base di una classe é composta da:
 *
 * [visibilitá] class [nome della classe] {
 *     //corpo della classe
 * }
 *
 * la [visibilitá] é un attributo che si da alla classe per definire chi all'esterno di questo file
 * o di questa cartella puó vederla. I valori che puó assumere sono:
 * public -> La possono vedere tutti, sia le classi che le cartelle esterne.
 * vuoto -> Non la puó vedere nessuno, se non le altre classi nello stesso file.
 *
 * l'attributo class é un attributo standard che definisce che stiamo creando una nuova classe.
 *
 * il [nome della classe] serve a rappresentare indicativamente cosa questa classe sta andando a rappresentare.
 * Perché la classe sia una classe Java valida, occorre che la classe pubblica del file corrisponda al nome del file
 * .java per esempio per la classe Persona avremo il corrispettivo file Persona.java
 * Questo é molto importante perché quando il compilatore andrá a creare il nostro eseguibile cercherá per primo nel nostro
 * file il nome della classe corrispondente.
 *
 * Dopo il nome della classe, sono presenti due parentesi graffe una aperta { e una chiusa }.
 * Queste parentesi vanno a racchiudere tutta la descrizione di come la classe viene rappresentata e di come si
 * comporta. Andiamo a vedere ora come si definisce e come si descrive una classe:
 */
// v----- Visibilitá
public class Persona {
//       ^----- Attributo standard di definizione della classe

    /**
     * ************************************************************
     * ************************ Attributi: ************************
     * ************************************************************
     * Gli attributi sono una caratteristica della classe. Cosa si intende?
     * Prendiamo come esempio la classe Persona: una persona come attributi potrebbe avere il colore degli occhi,
     * il colore dei capelli, la lunghezza dei capelli, il colore della pelle, il sesso, la grandezza della bocca e
     * delle orecchie, etc.. etc..
     * Tutti questi, sono attributi e servono a descrivere la classe.
     * Gli attributi quindi, non sono una descrizione del comportamento, ma si limitano semplicemente a definire
     * le caratteristiche di base necessarie a rappresentare a pieno la classe.
     * Andiamo a vedere un esempio:
     */
    private int altezza;
    /**
     * In questo esempio possiamo vedere come abbiamo definito l'attributo per l'altezza della persona.
     * La definizione base di un attributo é:
     *
     * [visibilitá] [tipo di attributo] [nome dell'attributo]; <- fare ATTENZIONE al punto e virgola
     *
     * Come per la definizione di una classe, anche gli attributi possono avere dei livelli di visibilitá.
     * Le visibilitá degli attributi peró hanno una funzione differente rispetto alle classi:
     * Dove la visibilitá per le classi cambia se una classe puó essere VISTA al di fuori del file o della cartella,
     * la visibilitá per gli attributi, invece definisce se le altre classi che andranno ad utilizzare questa, possono
     * vedere e MODIFICARE i valori che noi andremo a metterci all'interno.
     *
     * Le [visibilitá] di un attributo peró possono essere molteplici:
     * public -> l'attributo puó essere visto e modificato da chiunque indipendentemente da dove esso sia.
     * private -> l'attributo puó essere visto e modificato solamente dalla classe stessa
     * protected -> l'attributo puó essere visto e modificato solo dalle classi nella stessa cartella
     *
     * il [tipo di attributo] serve a definire come verrá rappresentato l'attributo e quali valori potranno essere messi
     * all'interno dell'attributo.
     * Prendendo il nostro esempio dell'altezza, noi abbiamo inserito come tipo di attributo int, che rappresenta un valore
     * intero. Questo perché la nostra altezza verrá rappresentata in centimetri e quindi non ci sará bisogno di inserire
     * numeri con la virgola. Avessimo voluto usare i metri avremmo potuto usare il tipo float, che accetta numeri con la
     * virgola.
     *
     * Ci sono molti altri tipi di attributi, per esempio:
     * boolean -> serve a rappresentare stati di vero/falso
     * char -> serve a rappresentare un carattere da tastiera
     * String -> serve a rappresentare testi in generale (Questo tipo di attributo é esclusivo per Java)
     *
     * É molto importante fare attenzione al punto e virgola. Senza di esso il compilatore non riesce a capire quando
     * fermarsi a leggere per interpretare una istruzione e quindi continuerebbe a leggere senza capire cosa fare.
     *
     * É importante dire che una classe puó avere un qualsiasi numero di attributi, non vi é limite.
     *
     * Andiamo ora a definire qualche altro attributo:
     */

    private int peso;
    private int mani;
    private int piedi;
    private int ditaPerArto;
    //Bene ora che abbiamo definito qualche attributo in piú possiamo passare alla creazione di una classe

    /**
     * ****************************************************************************
     * ************************ Costruttore di una classe: ************************
     * ****************************************************************************
     *
     * Il costruttore di una classe é una parte di codice che definisce COME una classe viene costruita.
     * Fino ad ora, la nostra classe Persona é come se fosse stata solo progettata su carta, senza essere veramente
     * "tangibile" e modificabile. Nel momento in cui noi andiamo a costruire la nostra classe, andiamo a definire
     * la sagoma dentro quale andiamo ad inserire i nostri valori.
     * Esistono vari tipi di costruttori, andiamo a vederne uno:
     */
    public Persona() { }
    /**
     * Ecco qua. Questa é la definizione di un costruttore dell'oggetto Persona.
     * Con questo costruttore peró noi non andiamo a definire nessun attributo, quindi quando verrá costruito il
     * nostro oggetto Persona, sará completamente vuoto. É come se creassimo semplicemente un fantoccio esterno senza niente.
     * Andiamo a vedere come poter creare una Persona con qualche attributo:
     */
    public Persona(int altezza, int peso, int mani, int piedi, int ditaPerArto){
        this.altezza = altezza;
        this.peso = peso;
        this.mani = mani;
        this.piedi = piedi;
        this.ditaPerArto = ditaPerArto;
    }
    /**
     * Ottimo. Con questo costruttore andiamo invece a definire che la Persona puó essere costruita giá con dei valori
     * dati al momento della creazione. Con questo costruttore, possiamo dare una forma alla nostra persona, cosí da
     * poterne poi chiedere i dati (Possiamo? Perché? Prova a rispondere)
     *
     * Come possiamo vedere, all'interno del costruttore, andiamo ad assegnare agli attributi i valori che riceviamo
     * mentre che costruiamo l'oggetto.
     * Gli attributi compresi tra parentesi si chiamano PARAMETRI e sono i valori che questo costruttore riceve da noi.
     * Gli attributi invece preceduti dalla dicitura "this." sono quelli che abbiamo definito in alto.
     * Per differenziare tra il PARAMETRO altezza e L'ATTRIBUTO altezza, si utilizza "this." seguito dal nome dell'attributo
     * per indicarlo altrimenti se avessimo scritto "altezza = altezza", il compilatore lo avrebbe interpretato come se stessimo
     * assegnando al parametro che noi passiamo se stesso senza veramente metterlo dentro alla classe.
     *
     * RICORDA: l'ATTRIBUTO é una caratteristica della classe, NON il PARAMETRO.
     *
     * C'é da fare attenzione ad un aspetto molto importante dei costruttori: Finché non viene definito nessun costruttore
     * nel file della classe Java, la Java Virtual Machine (JVM) creerá automaticamente un costruttore vuoto.
     * Dal momento in cui un qualsiasi costruttore viene definito nel file, vengono considerati valiti SOLAMENTE
     * quelli definiti nel file.
     *
     * Andiamo ora a vedere i metodi
     */

    /**
     * ***********************************************************
     * ************************ Funzioni: ************************
     * ***********************************************************
     *
     * I metodi sono delle funzioni che ci permettono di far fare alla nostra classe delle azioni.
     * Andiamo intanto a vedere come si definisce una funzione:
     */

    public int contaLeDita(){
        return ditaPerArto * mani + ditaPerArto * piedi;
    }

    /**
     * Come possiamo vedere, la definizione base di una funzione é composta da:
     * [visibilitá] [tipo di dato restituito] [nome della funzione]() {
     *     //corpo della funzione
     * }
     * la [visibilitá] puó essere di vari tipi, ma ha una funzione diversa rispetto alla visibilitá delle classi e
     * degli attributi. La visibilitá delle funzioni definisce quali azioni vengono esposte alle altre classi per essere
     * chiamate e far fare qualcosa al nostro oggetto:
     * public -> la funzione puó essere utilizzata da chiunque costruisca questo oggetto
     * private -> la funzione puó essere usata solo internamente alla definizione della classe
     * protected -> la funzione puó essere usata da tutte le classi che costruiscono l'oggetto che sono nella stessa cartella
     *
     * Il [tipo di dato restituito] é il tipo di valore che viene restituito quando l'azione finisce.
     * Se per esempio prendiamo la nostra funzione contaLeDita(), nel momento in cui chiederemo alla nostra classe
     * Persona di contare le dita, ci restituirá un valore intero (ecco perché int) con il valore che vogliamo.
     * Tutto questo é possibile tramite la dicitura "return".
     * tutto quello che é compreso tra return e il ; sará il valore che noi riceveremo.
     * É da notare bene, che nella nostra funzione possiamo scrivere quante istruzioni vogliamo prima di restituire il nostro
     * valore. Per esempio avremmo potuto mettere dentro alla nostra funzione:
     * {
     *     int ditaMani = ditaPerArto * mani;
     *     int ditaPiedi = ditaPerArto * piedi;
     *     int ditaTotali = ditaMani + ditaPiedi;
     *     return ditaTotali;
     * }
     * il risultato sarebbe stato lo stesso!
     * Il [tipo di dato restituito] puó assumere valori come per gli attributi, ma con una differenza in piú.
     * Se la nostra funzione deve solo svolgere lavoro e non ci deve restituire nessun valore, allora possiamo usare
     * la dicitura "void" per indicare che non abbiamo bisogno di restituire niente con la dicitura "return".
     * Es: public void parla(){}
     *
     * il [nome della funzione] é il nome che verrá assegnato alla funzione contenente questo gruppo di istruzioni
     * per poter essere chiamata.
     */

    /**
     * ***************************************************************************
     * ************************ Esercizio (Obbligatorio): ************************
     * ***************************************************************************
     *
     * Creare una classe Triangolo (prendiamo i triangoli rettangoli) che abbia un costruttore con parametri,
     * un attributo per la base, uno per l'altezza e che abbia la funzione di calcolo dell'area e del perimetro
     *
     * **************************************************************************
     * ************************ Esercizio (Facoltativo): ************************
     * **************************************************************************
     *
     * Creare una classe a piacimento che abbia almeno 2 costruttori, 4 attributi e 3 metodi di cui uno void.
     */
}
