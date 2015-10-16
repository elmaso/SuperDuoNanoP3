package barqsoft.footballscores;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies
{
    public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;
    public static String getLeague(int league_num)
    {
        switch (league_num)
        {
            case SERIE_A : return "Seria A";
            case PREMIER_LEGAUE : return "Premier League";
            case CHAMPIONS_LEAGUE : return "UEFA Champions League";
            case PRIMERA_DIVISION : return "Primera Division";
            case BUNDESLIGA : return "Bundesliga";
            default: return "Not known League Please report: "+league_num;
        }
    }
    public static String getMatchDay(int match_day,int league_num)
    {
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                return "Group Stages, Matchday : 6";
            }
            else if(match_day == 7 || match_day == 8)
            {
                return "First Knockout round";
            }
            else if(match_day == 9 || match_day == 10)
            {
                return "QuarterFinal";
            }
            else if(match_day == 11 || match_day == 12)
            {
                return "SemiFinal";
            }
            else
            {
                return "Final";
            }
        }
        else
        {
            return "Matchday : " + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals,int awaygoals)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return " - ";
        }
        else
        {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName(String teamname)
    {
        if (teamname==null){return R.drawable.no_icon;}
        switch (teamname)
        { //This is the set of icons that are currently in the app. Feel free to find and add more
            //as you go.
            case "AFC Bournemouth" : return R.drawable.burney_fc_hd_logo;
            case "Arsenal FC" : return R.drawable.arsenal;
            case "Aston Villa FC" : return R.drawable.aston_villa;
            case "Bayer Leverkusen" : return R.drawable.ic_bayer_leverkusen_logo;
            case "Borussia Dortmund" : return R.drawable.ic_borussia_dortmund_logo;
            case "Hannover 96" : return R.drawable.ic_hannover_96_logo;
            case "Chelsea FC" : return R.drawable.chelsea;
            case "Crystal Palace FC" : return R.drawable.crystal_palace_fc;
            case "Everton FC" : return R.drawable.everton_fc_logo1;
            case "Eintracht Frankfurt" : return R.drawable.ic_eintracht_frankfurt_logo;
            case "FC Augsburg" : return R.drawable.ic_augsburg_logo;
            case "FC Bayern München" : return R.drawable.ic_bayern_munchen_logo;
            case "FC Schalke 04" :return R.drawable.ic_schalke_04_logo;
            case "Hamburger SV" : return R.drawable.ic_hamburger_sv_logo;
            case "Hertha BSC" : return R.drawable.ic_hertha_berlin_logo;
            case "Leicester City FC" : return R.drawable.leicester_city_fc_hd_logo;
            case "Liverpool FC" : return R.drawable.liverpool;
            case "Manchester City FC" : return R.drawable.manchester_city;
            case "Manchester United FC" : return R.drawable.manchester_united;
            case "Newcastle United FC" : return R.drawable.newcastle_united;
            case "Norwich City FC" : return R.drawable.norwich_city;
            case "Southampton FC" : return R.drawable.southampton_fc;
            case "Stoke City FC" : return R.drawable.stoke_city;
            case "Sunderland AFC" : return R.drawable.southampton_fc;
            // case "SV Darmstadt 98" : return R.drawable.
            case "Swansea City FC" : return R.drawable.swansea_city_afc;
            case "Tottenham Hotspur FC" : return R.drawable.tottenham_hotspur;
            case "Watford FC" : return R.drawable.watford;
            case "West Bromwich Albion FC" : return R.drawable.west_bromwich_albion_hd_logo;
            case "West Ham United FC" : return R.drawable.west_ham;
            case "1. FC Heidenheim 1846" : return R.drawable.ic_1_fc_heidenheim_1846;
            case "1. FC Kaiserslautern" : return R.drawable.ic_1_fc_kaiserslautern;
            case "1. FC Nürnberg" : return R.drawable.ic_1_fc_nuremberg;
            case "1. FC Union Berlin" : return R.drawable.ic_1_fc_union_berlin;
            case "Arminia Bielefeld" : return R.drawable.ic_arminia_bielefeld;
            case "Eintracht Braunschweig" : return R.drawable.ic_eintracht_braunschweig;
            case "FC St. Pauli" : return R.drawable.ic_fc_st_pauli;
            case "Fortuna Düsseldorf" : return R.drawable.ic_fortuna_dc3bcsseldorf;
            case "FSV Frankfurt" : return R.drawable.ic_fsv_frankfurt;
            case "1. FSV Mainz 05" : return R.drawable.ic_mainz_05_logo;
            case "Karlsruher SC" : return R.drawable.ic_karlsruher_sc;
            case "MSV Duisburg" : return R.drawable.ic_msv_duisburg;
            case "RasenBallsport Leipzig" : return R.drawable.ic_rasenballsport_leipzig;
            case "SC Freiburg" : return R.drawable.ic_sc_freiburg;
            case "SC Paderborn 07" : return R.drawable.ic_sc_paderborn;
            case "SpVgg Greuther Fürth" : return R.drawable.ic_spvgg_greuther_fc3bcrth;
            case "SV Sandhausen" : return R.drawable.ic_sv_sandhausen;
            case "TSV 1860 Munich" : return R.drawable.ic_tsv_1860_munich;
            case "TSG 1899 Hoffenheim" : return R.drawable.ic_hoffenheim_logo;
            case "VfL Bochum" : return R.drawable.ic_vfl_bochum;
            case "VfL Wolfsburg" : return R.drawable.ic_werder_bremen_logo;
            case "VfB Stuttgart" : return R.drawable.ic_vfb_stuttgart_logo;
            case "Werder Bremen" : return R.drawable.ic_werder_bremen_logo;

            default: return R.drawable.no_icon;
        }
    }
}
