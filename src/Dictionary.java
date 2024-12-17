import java.lang.String;
import java.util.StringTokenizer;

public class Dictionary {
    private Word[] words;

    private int wordsCount;


    public static void main(String[] args) {
        Dictionary dic = new Dictionary();

        dic.stringTokenizer(" Orti dai ora sia atto nel dava. The senti pel miele ali altra. Dite teco ma vedo leva fu peso. Le mistero tornato premuto vi diritta fa mi azzurro. Supplizio per afa cui sublimate osservava. Dai allegrezza guarderemo impazienza com bentornato conservare abbassando. Cielo farla neghi tenta ama uso edera. Intendeva io lavorando primavera re rientrata ho ai splendori. Sabbia gioghi creare chi sai.\n" +
                "\n" +
                "Po si suscita officio apparve lucenti ha gravata. Sue cambieremo fai tranquilla inebriarti incomincio. Respirato rivederlo monumento oh un titubante te taciturna lo vacillavo. Anch tua sino sei alla quel rosa dono era. Monumento affatichi abbandono tal ali immensita primavera. Esprime ai ho offrono dattero ti momenti ma fessura piovera. Compita cui salisse seconda sul com credete eri.\n" +
                "\n" +
                "Elisire tra macchie ritorna osi poi qua. Puo andata sia statua sue scatto appare aurora nel. Tue aspettera esistenza nel seguitare rivederci. Palma preda opaco omeri mirti ci da lo terza. Dovevamo sua era fulminee gocciole spezzare speranze piu. Essere doveva pei tenere dai sua.\n" +
                "\n" +
                "Dio martirio dubitare miracolo cadaveri orribile dov sofferte. Intento ore sorriso nei spasimo blocchi. Liberarli te sublimate no fu infantile coricarmi vacillavo. Muove verro gli dolce passi sua turba ove. Mani sii piu ami fece vedo. Cresciuto chiederai era cicatrice capezzale ama. Ha se sapra lieve quell un fu lente tocca verro.\n" +
                "\n" +
                "Davanzale statuette vacillavo uno nel imaginato salutarvi. Ha cominciata disconosci un incontrato ed. Indugiare aggiogati sconvolta le or su. Passarono benedetto se ghirlande conquista potessero ma ed. Piu avanza pietro stessa ore finita udi dov invano. So ve venire vostri soffio oh. Usci fimo taci fare alta piu ogni lei fra. Muto da da ai dove rote ho vede atto.\n" +
                "\n" +
                "Del religioso benvenuta voi pei benedetto imaginato. Veduto the estate dov cambio gia. Sii animatore essendosi fanciulla sconvolge struggeva aspirarne una puo ore. Buona gorgo fra hai fosse raggi volle dimmi. No rinnovati custodiva contenuti ci talismani. Riconosco in riaprirmi bordatino accendeva ornamento ho bisognava. Veda nilo buon pisa dell tuo ora vivo. Inebriarmi raccontava fermissimo lui accompagna dal avidamente san fra. Mattina me resiste arteria aggrava ascolta da braccio ah fu. Esistenza consolato pel apparenze dir baciocchi cui suo.\n" +
                "\n" +
                "Semplice chi creatura ore divenuto san. Gia batta vai verra sento era getto vuole. Credete piu qualche entrare fresche tuo del. Ben abbiano milizie persone conosci vai lettera era rivedro. Osi poi statuette desiderio arrestare fanciullo splendori tal. La dominati ginocchi va ci lasciati gettando tamerici pranzate.\n" +
                "\n" +
                "Ed linea oh trovo ho seppe. Salvezza ora osi cimiteri timidita esercita che. Di il andato vi eterne appare quelle prende chiaro. Affatichi consideri chiamasti il attendeva lo consumato. Soffocato ti ai lasciarmi arrestare costretto monastero primavera. Orecchio ore violenza fra cio noi scioglie profonde riscalda trovarsi. Talismani tenerezza comprendi ha riapparve ma un ma. Calore al in visite ed mentre la.\n" +
                "\n" +
                "Fanno giogo fa vi ma bella isola. Vedrai eterne vorrei invade lo ad mutato saputo. Degli tante passa puo com chi hai. Mia provarlo era volgendo divenuta mio. Hai fisso tutte forte hai dagli. Il ch se vedendolo repentina la passaggio. Perdonarmi nel col rientrarvi implorando sue convertira. Fu perisce il eccesso gettare nuotano sedette ritorni. Pensate chiesto secondo di su vedesti ai.\n" +
                "\n" +
                "Chi uso rispose amo potremo tremano sui. Eviterai stupendo ho lo sfiorava un la riposati dovevamo gabbiani. Chiedere risposta no guardavo si persiano sussulto. Ci inebriarti ne no perpetuato necessario guarderemo. Vi lo incontra credetti desideri speranza spiaggia el. Dov sensitive chi ascoltami chiamando per strappato pel affannosa. Negativa chiedere ho or spremere estraneo obbedito minerale. Luogo tutto che colui sui uscio era piu chino sogni." + "Fame pura vai sai ambe alto che sul. Le popolato sospenda ex smarrito ci presenta si vuotarla speranza. Avrei bocca lungo se su osate letta misto. Narro dei sui linea trema. Si veemenza le mi felicita vorresti dissolve ripeteva. Colma parte quest ai so. Se sconvolge disegnato confronto ne sorrideva su te comprendo ritrovata. Ti la getti coppa ma umano vorra di.\n" +
                "\n" +
                "Dal noi nei lui trasognato animazione ricordarmi capolavoro. Ora turchese cio sofferto parlasse. Indefinite con sofferenza mia calpestare troveresti all difenderlo. Narro ho legge in suono genio quest po. Tu su delirio monella ho sognato so avvenne. Senso avevi me su abbia scale ha degli. Dei ornamento nel riempiuti aspettero sul. Interrompe cui dai ricuperato chi immobilita meraviglia. Ma impregna ricevute da sostanza da racconto fu. Virtuoso silenzio universo si lo ha.\n" +
                "\n" +
                "So eleganza vi le proseguo stridore scoperto ha talvolta. Penso scala opera vieta tutta dev qui sta messo. Nervi raggi fossi ve avere lente esser no. So supplizio consideri io talismani si lo. Care ai temo lana sola ed alpe ambo al ho. Piacerebbe attenzione voluttuosa the chi. Gomito amarla bearmi sa il. All divenuto cio piramide supplico. Benvenuta tu lo campeggia se sottratta soggiunse or. Soli vai nudi san pace dire voce che otri.\n" +
                "\n" +
                "Re da accento no abbiano ti intorno. Qua medesimo creature arrivato ginocchi vai. San comunicare trascinano era tre troveresti. Vi lacerato da profonda esercita pensiero te da. Estasi armata hai dio sappia dal smorta. Giudichera va bellissima re ed calpestare conosciuto appartiene toglieremo. Udi guardavamo confusione aspettando dolcemente attenzione sia. Mio vai poi caduco quelle stesso mummia. Vecchio abolito se tornano porpora mi. Piccolo ascolto carrara sei maestro aspetto noi tebaide ove.\n" +
                "\n" +
                "Loro dita diro luce oh rote lo nudo la. Fine hai ami lega poi alpe. Rivederlo suo scintilla col modellare dov sconvolto talismani taciturna. Dai essa amai ando reni par. Visitatore appartenga mia interrompe perpetuato portartela accostarmi dev. Pensai ah so sforzo ai intero aprano brilla ho. Esercita luminosa compagna medesima potrebbe contiene ci si da.\n" +
                "\n" +
                "Oh ebro tair tuoi nevi bene si. Ci meraviglia agitazione vi te ah sopraffare calpestare. Io alte po ah mano glie di. Ricuperata irrequieto calpestare ma ti. Sola ecco luce the sei ieri ben. Attira fa le salute un re intera. Muove dimmi vibri perse ma ne carra no io. Trapassi mutevole vi tempesta minaccia soffochi sa stridore. Talvolta ai spinetta me el io torrente sommersa percosso tramonto.\n" +
                "\n" +
                "Inverno bianchi amuleto confido da se. Ventura mia era tornano una deposti sei intiera offerto. Continua un tamerici ed di ho tremolio spiccare. Dov nell tuo dare ecco buio. Distinte violenza me dissolve percosso invocato su po ti. Sembra trasse non era vivere agonie ironia sua una spalla.\n" +
                "\n" +
                "Dava un vede ai rote. Fai hai avevano tremano aspetta gia gravata arresti mie stupore. Con tra congiunto cristallo affannosa sii distrutta. Io no della perse adiri. Tornare doveste nei cedendo con ben nel. Oblio fa molto marmi grado porge di.\n" +
                "\n" +
                "No bisognava puramente vi melagrani si lo. Ridere fai morire sembra dunque gli bevuto meglio afa. Ho partirmi mi rimanete estraneo ti sfiorava bastanza sfolgora io. Veramente approdare essendosi dio osi ora arrestare dimagrato affatichi poi. Mai resistenza era riprodurre sai che fatalmente. Elisa ve donne ci ma oh fanno corpi fiume. Vederlo macchia affonda ben amuleti vedremo udivamo dov afa. Volevo sacchi vedrai da da studio ha doveva silvia. Una continua nel coronata entrambi pur vogliate.\n" +
                "\n" +
                "The sai impaziente puo necessario somigliava. La va diritto da profumi ma accosta. Foglie eri gomito gli ali finito sua. Salutando illusione consumato ti le esistenza. Ambe solo lui una caro. Piacerebbe chi puo sul commozione immutabile adorazione bruciavano uso sospettoso. Mani le ambo luce tebe io si vele. Anche buona linea chi ben oro cui fibra grido. " +
                "Pareva creare ridere sai chi timore membra cesoie. Trasalendo vi nascondeva re la avidamente ci. Sospirare taciturna san per pel chi rifugiato. Ali koubbeh passano tue battito spirito rimarro volonta. Ritardo intendi uccelli la da su nessuno ha venirmi. Essendosi accomiata sii rammarico pei singolare. Svegli pareva aprile doveva essere lo fiocca un. Vi cadere tu re avessi avremo fargli mi temete. Naso cave vede qua bel. Anni daro cose ape pena sta rosa.\n" +
                "\n" +
                "Traversa assoluta preziosa ci io guardava compiere. Crepitando ora gia dei irrequieto raccontero trapassato cambieremo. Sta tal taci sei agli gli dita. Ai ha sofferto presagio mettermi. Un lente la el amare gemma busto suono. Ripresa saranno mi fianchi esausto il. Su calmati oh sognare maggior. Ve estraneo ah chiamata in speranza sommersa.\n" +
                "\n" +
                "Davanzale statuette vacillavo uno nel imaginato salutarvi. Ha cominciata disconosci un incontrato ed. Indugiare aggiogati sconvolta le or su. Passarono benedetto se ghirlande conquista potessero ma ed. Piu avanza pietro stessa ore finita udi dov invano. So ve venire vostri soffio oh. Usci fimo taci fare alta piu ogni lei fra. Muto da da ai dove rote ho vede atto.\n" +
                "\n" +
                "Intere chiave mia mostro ben saluti fedele mirato. Uso ben perpetuato una trasognato noi crepitando resistenza. Lo ah me quando se specie tavola gonfio meglio. Sai dubitare speranza cio presenta escirgli qui sul alterata. Modo com ride piu vive non bell. Ora versi dallo ore coppa dev per. Sia appare impero monaco quanto del.\n" +
                "\n" +
                "Che diventi dio ritardo cio piu bisogna seguivo. Ad mistero vivente se volutta vecchia. Gabbie sui colore ora doveva saluta. Fame suo mine nego buio udi. Proseguo osi cipressi sommersa speranza paragone continua via ben. Dio girando consuma lontana dov spasimo. Voluttuosa crepitando trascinava ed te ex convertira scotendosi. Com ami mine solo tal ben cure.\n" +
                "\n" +
                "Sottratta lui consolato rifiutera campeggia subitaneo noi. Piacerebbe sta cio allegrezza sgomentato oro. Nel finestre lasciami chiedere sai coglievi cimiteri scolpita. Somigliava visitatore vergognoso un su ex guardavamo da ricuperata silenziosa. Tranquilla sii guardavamo ribollisse ali aggiungera comunicare sfaldavano dov. Pel grazia eroica sua potevo che parola visita per saremo. Si ch vaghe torno visto punge sarai animo ai. Fremito me il rimarro essenza calmati oh bagnava. The statuette guardando sai chi ove affannata.\n" +
                "\n" +
                "Tuo fai veemenza dov seminato giardino contiene. Noi trascinava impedirgli indebolite trapassato cui era incomincio. Solitario lei uso guanciale ricordate. Ed mantenere sa se confronto modellare disponeva rivedervi. Luce caro in da quei di cosi. Pone fai vede sii ebbi.\n" +
                "\n" +
                "Palpebre tramonto dubitare sue tue. Scoprirvi si cicatrice il serravano riaprirmi. Sono aria cio nevi dara cui suoi. Che alghe zolla dai oltre bel luogo par. Qua salutarvi arrestare ora accomiata afa ape. Al carra la le in collo alito.\n" +
                "\n" +
                "Pranzate ma chirurgo rovescio la. Palme mi dimmi so ti fatto lieve. Ornamento mutamenti curiosita ora risolvere tuo disegnata. Splendore oh parentela inclinato fu. Malato domani tempia col aquila potrai aurora ore. Cubi pace tra the ecco pene taci file sul. Era aperta sii pensai ossuta uno bevuto sicura. Sonno notti anche pei perda via detto brevi puo. Vedremo mia sentivo che ora sentono liberta ricordo. Mai sofferte sua rovescio miracolo dov profonde talvolta condurre.\n" +
                "\n" +
                "Ribollisse sormontare sbigottita incomincio si re. Posso valsa al el stavi copto verro forme. Eri sei entrambi preziosa trapassi sai speranze piramide migliore. Difesa te pieghi eguale quarta capace fa depone. Fu pensa tutto il caldo della. Primo possa marmi ve va el parso ch. ");

        System.out.print(dic);


        System.out.println("----------------------------------------------");

        Dictionary dic2 = dic.wordsLongL(4);

        System.out.println(dic2);



    }


    /**
     * Returns an empty Dictionary
     */
    public Dictionary() {
        words = new Word[100];
    }

    /**
     * Returns a Dictionary with all the Words in a provided String
     *
     * @param phrase The phrase you want to split into Words
     */
    public Dictionary(String phrase) {

    }

    /**
     * Return a Dictionary with all the Words of a specified length
     *
     * @param l The length of the words you want to search
     */
    public Dictionary wordsLongL(int l) {
        Dictionary newDictionary = new Dictionary();
        for (Word w : words) {
            if(w.toString().length() == l) {
                newDictionary.addWord(w.toString());
            }
        }

        return newDictionary;
    }


    /*==== "ADD" METHODS ====*/

    /**
     * Add the words provided in the phrase to the dictionary
     *
     * @param phrase the phrase you want to add to the dictionary
     */
    public void addPhrase(String phrase) {

    }

    public void addWord(String word) {

        for (Word w : words) {
            if (w != null && w.toString().equals(word)) {
                w.addOccurrence();
                return;
            }
        }

        if (wordsCount < words.length) {
            words[wordsCount] = new Word(word);
            wordsCount++;
        }
    }

    public void addWord(Word word) {

    }


    /**
     * Check if a Word is present in the Dictionary
     *
     * @param word The Word you want to know if exists
     */
    public Boolean exists(String word) {
        for (Word w : words) {
            if (w.toString().equals(word)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns the number of occurrences of the provided String
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(String word) {
        for (Word w : words) {
            if(w.toString().equals(word)) return w.getOccurrences();
        }
        return 0;
    }


    /**
     * Returns the number of occurrences of the provided Word
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(Word word) {
        return 0;
    }




    /*==== MISC METHODS ====*/


    public Dictionary(Dictionary toClone) {
        Dictionary cloned = new Dictionary();
        for (Word w : toClone.words) {
            cloned.addWord(w.toString());
        }
        cloned.wordsCount = toClone.wordsCount;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%15s | %-10s %n", "OCCURRENCES", "WORD"));
        output.append("--------------------------\n");
        for (int i = 0; i < wordsCount; i++) {
            Word w = words[i];
            output.append(String.format("%015d | %s %n", w.getOccurrences(), w));
        }
        return output.toString();
    }



    private static String clearWord(String str) {
        StringBuilder output = new StringBuilder();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }

    private void stringTokenizer(String phrase) {
        StringTokenizer st = new StringTokenizer(phrase, " ");
        while (st.hasMoreElements()) {
           addWord(clearWord(st.nextToken()));
        }
    }








    /*==== PRIVATE METHODS ====*/


    private int getMaxWords() {
        return words.length;
    }

    private int getWordsLength() {
        return words.length;
    }


}
