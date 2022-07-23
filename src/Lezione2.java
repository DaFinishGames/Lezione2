/**
 * Benvenuta alla lezione 2 di Java.
 * Fino ad ora abbiamo creato delle classi Java, ma ancora non le abbiamo utilizzate.
 * Questo é l'equivalente di costruire degli strumenti di lavoro, peró non utilizzarli per eseguire un lavoro.
 * In questa lezione quindi andremo a creare una classe ulteriore, ma con una particolaritá.
 * Andremo a creare un metodo specifico che sará il nostro trampolino di partenza per l'esecuzione del nostro programma.
 *
 * ************************************************************
 * ************************ Lezione 2: ************************
 * ************************************************************
 * Iniziamo subito con il creare una classe di nome Lezione2
 */
public class Lezione2 {
    /**
     * *******************************************************
     * ************************ Main: ************************
     * *******************************************************
     * All'interno della nostra classe, andiamo a creare un metodo con una firma molto specifica.
     * É da notare bene, che la firma del nostro metodo é scritta in questo modo per QUALSIASI classe che abbia intenzione
     * di integrare un metodo main che andrá eseguito. Quindi é IMMODIFICABILE:
     *
     * public static void main(String[] args){}
     *
     * Questo metodo é molto particolare, andiamo ad analizzarlo insieme:
     * [public] - La visibilitá public indica che questo metodo puó essere usato da qualsiasi altra classe Java. Questo permette
     * alla Java Virtual Machine (JVM) di eseguire questo metodo per noi e quindi far iniziare l'esecuzione del programma.
     *
     * [static] - Questo attributo permette al metodo di essere statico. Cosa vuol dire statico? Statico vuol dire che
     * il metodo in questione sará disponibile a livello di struttura, cioé non ci sará bisogno di costruire un oggetto di
     * una classe Java, ma il metodo sará disponibile semplicemente richiamando il nome della classe seguito da un punto
     * e infine seguito dal nome del metodo: Es:
     *
     * //codice precedente
     * Lezione2.main();
     * //codice successivo
     *
     * [void] - Il tipo di questo metodo é void. Come abbiamo visto in precedenza, questo significa che il metodo non deve
     * restituire niente come valore. Il nostro metodo andrá ad eseguire "lavoro" e basta.
     *
     * [main] - Il nome del metodo é main ed é sempre main per qualsiasi metodo che abbia intenzione di essere eseguito di
     * default. Questo metodo é appunto interpretato dalla Java Virtual Machine (JVM - si, da adesso in poi la chiameró
     * solamente JVM) come metodo standard di partenza per l'esecuzione della classe. É altamente sconsigliato creare altri
     * tipi di metodi che si chiamano allo stesso modo ma con firma diversa perché potrebbero creare confusione nelle classi.
     * Il nome "main" per un metodo deve essere quindi considerato come se fosse una parola chiave Java.
     * In questo metodo, noi possiamo finalmente andare a costruire degli oggetti e fargli fare delle azioni.
     * É da notare che tra le parentesi tonde "()" é presente un parametro.
     * Questo parametro é molto importante non dimenticarlo, ma non lo andremo a vedere ora nel dettaglio perché
     * implica concetti un po piú complessi di Java che andremo a vedere in seguito nelle prossime lezioni.
     * All'interno delle parentesi graffe "{}" possiamo inserire delle istruzioni per far fare delle azioni alla nostra
     * classe Java.
     * Andiamo a vedere cosa possiamo fare:
     */
    public static void main(String[] args){
        /**
         * Per prima cosa, quello che possiamo fare é iniziare a creare delle variabili alla quale possiamo assegnare dei
         * valori. Come ad esempio:
         */
        int numeroDita=5;
        /**
         * Allo stesso modo di come quando siamo andati a creare degli attributi nella classe Persona, all'interno dei
         * metodi esse diventano variabili.
         * Queste variabili a differenza degli attributi, non hanno visibilitá. Sono automaticamente visibili a tutto il
         * codice successivo a quando sono stati scritti, in ordine di scrittura. Se quindi dichiariamo una varibile dopo
         * a quando vogliamo utilizzarla, non riusciremo perché non é a noi visibile e dovrá essere spostata ed essere
         * dichiarata prima. Es:
         *
         * //sbagliato:
         * int moltiplicato = 10 * valore; <- "valore" qui non esiste ancora e quindi dará errore
         * int valore = 5;
         *
         * //giusto:
         * int valore = 5; <- essendo che "valore" qui viene dichiarato prima
         * int moltiplicato = 10 * valore; <- quá il codice non dará nessun tipo di problema.
         *
         * Andiamo ora invece a vedere come possiamo costruire ed utilizzare la nostra classe Persona creata nella lezione 1:
         */
        Persona persona = new Persona();
        /**
         * Ecco qua!
         * Qui abbiamo costruito un oggetto persona. Per costruire un oggetto, bisogna SEMPRE inserire la dicitura "new"
         * seguita dal nome della classe con la firma di uno dei costruttori definiti nella classe (o quella di default se
         * disponibile). In questo modo noi siamo andati a creare effettivamente un oggetto Persona nella memoria della
         * nostra JVM. In questo modo, il nostro oggetto Persona, quali valori avrá all'interno? Perché ha quei valori?
         * Prova a rispondere!
         *
         * Andiamo quindi adesso a costruire un altro oggetto persona, peró questa volta utilizziamo l'altro costruttore:
         */
        Persona persona2 = new Persona(180,60,2,2,numeroDita);
        /**
         * Come possiamo vedere, possiamo inserire nel nostro costruttore sia valori fissi, sia valori tramite l'utilizzo
         * delle variabili. Con l'utilizzo delle variabili possiamo rendere il nostro programma piú dinamico, ma per l'obbiettivo
         * della lezione possiamo lasciare dei valori fissi.
         * Bene! Ora abbiamo un oggetto persona con dei valori (eh si! Avevi risposto bene?) e possiamo provare a fargli
         * dire alla nostra persona quante dita totali ha. Vediamo come:
         */
        int ditaTotali = persona2.contaLeDita();
        /**
         * Ecco qua! Ora nella nostra variabile ditaTotali avremmo il valore delle dita totali.
         * Cel'abbiamo fatta!! Abbiamo creato un oggetto, abbiamo inserito dei valori all'interno e abbiamo calcolato
         * quante dita ha in totale la nostra persona... peró... HEY! Come facciamo a sapere effettivamente quante dita ha?
         * Chi ci dice che il valore in ditaTotali non sia completamente sbagliato?
         * Corre in aiuto il metodo statico "print()" della classe System.
         */
        System.out.print("dita totali: " + ditaTotali);
        /**
         * Perfetto! Ora abbiamo conferma che le dita sono 20!
         * Vediamo peró la differenza tra un metodo statico ed un metodo non statico.
         * prendiamo per esempio la nostra classe Persona e la classe System con i corrispettivi metodi contaLeDita() e
         * print().
         * Il metodo della classe Persona contaLeDita() come abbiamo visto, lo abbiamo utilizzato dopo aver costruito la
         * nostra classe Persona. Il metodo print() invece lo abbiamo utilizzato senza creare prima una classe System
         * (non abbiamo scritto da nessuna parte new System() ).
         * É proprio questa la particolaritá di un metodo statico. Un metodo statico non ha bisogno di un oggetto
         * costruito per essere utilizzato, ma basta essere chiamato tramite il solo nome della classe.
         *
         *
         * ************************************************************
         * ************************ Esercizio: ************************
         * ************************************************************
         * Ora Prova tu! Prova qui sotto ad utilizzare la classe che hai creato tu nell'esercizio precedente
         * (copiala e incollala nel progetto o creane una totalmente nuova!).
         * Fatti restituire dei valori e stampali nella console utilizzando il metodo print()!
         */
    }
}
