package barqsoft.footballscores;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;


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




    static void updateAppWidget (Context context,  AppWidgetManager appWidgetManager, int appWidgetId) {
        CharSequence widgetText = context.getString(R.string.widget_text);
        //We build the RemoteViews objects
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.football_scores_widget);
        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Make the widget update
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }
}
