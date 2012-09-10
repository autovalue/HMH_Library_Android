/**
 * 
 */
package hmh.android.app.util;

import hmh.android.app.AppInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/**
 * @author Habeeb Hooshmand
 * 
 */
public class AppManager {
    private Context context;

    public AppManager(Context context) {
	this.context = context;
    }

    public List<AppInfo> loadLauncherApps() {
	return load(Intent.ACTION_MAIN, Intent.CATEGORY_HOME);
    }

    public List<AppInfo> loadLauncherApps(String... exclusions) {
	List<AppInfo> list = loadLauncherApps();

	for (String item : exclusions) {
	    list.remove(item);
	}

	return list;
    }

    public List<AppInfo> loadApps() {
	return load(Intent.ACTION_MAIN, Intent.CATEGORY_LAUNCHER);
    }

    public List<AppInfo> loadApps(String... exclusions) {
	List<AppInfo> list = loadApps();

	for (String item : exclusions) {
	    list.remove(item);
	}
	return list;

    }

    private List<AppInfo> load(String action, String category) {
	ArrayList<AppInfo> list = new ArrayList<AppInfo>();

	PackageManager packman = context.getPackageManager();

	Intent mainIntent = new Intent(action, null);
	mainIntent.addCategory(category);

	final List<ResolveInfo> apps = packman.queryIntentActivities(
		mainIntent, 0);
	Collections.sort(apps, new ResolveInfo.DisplayNameComparator(packman));

	for (int i = 0; i < apps.size(); i++) {
	    AppInfo application = new AppInfo();
	    ResolveInfo info = apps.get(i);

	    application.setName(info.loadLabel(packman));

	    application.setActivity(new ComponentName(
		    info.activityInfo.applicationInfo.packageName,
		    info.activityInfo.name), Intent.FLAG_ACTIVITY_NEW_TASK
		    | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);

	    application.setIcon(info.activityInfo.loadIcon(packman));
	}

	return list;
    }

    public void uninstallApp(String packageName) {
	Intent i = new Intent(Intent.ACTION_DELETE, Uri.parse("package:"
		+ packageName));
	context.startActivity(i);
    }

    public void uninstallApp(AppInfo info) {
	uninstallApp(info.getPackage());
    }

}
