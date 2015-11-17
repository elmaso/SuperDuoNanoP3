package barqsoft.footballscores.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;


/**
 * Created by mariosoberanis on 10/14/15.
 * Implements the widget functionality
 */

public class FootballScoreWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds){
        final int N = appWidgetIds.length;
        for (int i = 0; i < N; i++){
            updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
        }

    }


    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }


    static void updateAppWidget (Context context,  AppWidgetManager appWidgetManager,
                                 int appWidgetId) {

    }
}
