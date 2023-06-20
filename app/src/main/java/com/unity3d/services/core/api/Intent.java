package com.unity3d.services.core.api;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Intent {
    private static WeakReference<Activity> _activeActivity;

    /* loaded from: classes3.dex */
    public enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class IntentException extends Exception {
        private IntentError error;
        private Object field;

        public IntentException(IntentError intentError, Object obj) {
            this.error = intentError;
            this.field = obj;
        }

        public IntentError getError() {
            return this.error;
        }

        public Object getField() {
            return this.field;
        }
    }

    @WebViewExposed
    public static void canOpenIntent(JSONObject jSONObject, WebViewCallback webViewCallback) {
        try {
            webViewCallback.invoke(Boolean.valueOf(checkIntentResolvable(intentFromMetadata(jSONObject))));
        } catch (IntentException e10) {
            DeviceLog.exception("Couldn't resolve intent", e10);
            webViewCallback.error(e10.getError(), e10.getField());
        }
    }

    @WebViewExposed
    public static void canOpenIntents(JSONArray jSONArray, WebViewCallback webViewCallback) {
        JSONObject jSONObject = new JSONObject();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            try {
                jSONObject.put(optJSONObject.optString("id"), checkIntentResolvable(intentFromMetadata(optJSONObject)));
            } catch (IntentException e10) {
                DeviceLog.exception("Exception parsing intent", e10);
                webViewCallback.error(e10.getError(), e10.getField());
                return;
            } catch (JSONException e11) {
                webViewCallback.error(IntentError.JSON_EXCEPTION, e11.getMessage());
                return;
            }
        }
        webViewCallback.invoke(jSONObject);
    }

    private static boolean checkIntentResolvable(android.content.Intent intent) {
        return ClientProperties.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private static Activity getStartingActivity() {
        WeakReference<Activity> weakReference = _activeActivity;
        if (weakReference != null && weakReference.get() != null) {
            return _activeActivity.get();
        }
        if (ClientProperties.getActivity() != null) {
            return ClientProperties.getActivity();
        }
        return null;
    }

    private static android.content.Intent intentFromMetadata(JSONObject jSONObject) throws IntentException {
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt(DownloadWorker.KEY_OUT_MIME_TYPE);
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            android.content.Intent launchIntentForPackage = ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null || num.intValue() <= -1) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.addFlags(num.intValue());
            return launchIntentForPackage;
        }
        android.content.Intent intent = new android.content.Intent();
        if (str != null && str2 != null) {
            intent.setClassName(str2, str);
        }
        if (str3 != null) {
            intent.setAction(str3);
        }
        if (str4 != null) {
            intent.setData(Uri.parse(str4));
        }
        if (str5 != null) {
            intent.setType(str5);
        }
        if (num != null && num.intValue() > -1) {
            intent.setFlags(num.intValue());
        }
        if (setCategories(intent, jSONArray)) {
            if (setExtras(intent, jSONArray2)) {
                return intent;
            }
            throw new IntentException(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
        }
        throw new IntentException(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
    }

    @WebViewExposed
    public static void launch(JSONObject jSONObject, WebViewCallback webViewCallback) {
        android.content.Intent intent;
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt(DownloadWorker.KEY_OUT_MIME_TYPE);
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            intent = ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str2);
            if (intent != null && num.intValue() > -1) {
                intent.addFlags(num.intValue());
            }
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            if (str != null && str2 != null) {
                intent2.setClassName(str2, str);
            }
            if (str3 != null) {
                intent2.setAction(str3);
            }
            if (str4 != null && str5 != null) {
                intent2.setDataAndType(Uri.parse(str4), str5);
            } else if (str4 != null) {
                intent2.setData(Uri.parse(str4));
            } else if (str5 != null) {
                intent2.setType(str5);
            }
            if (num != null && num.intValue() > -1) {
                intent2.setFlags(num.intValue());
            }
            if (!setCategories(intent2, jSONArray)) {
                webViewCallback.error(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
            }
            if (!setExtras(intent2, jSONArray2)) {
                webViewCallback.error(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
            }
            intent = intent2;
        }
        if (intent != null) {
            if (getStartingActivity() != null) {
                getStartingActivity().startActivity(intent);
                webViewCallback.invoke(new Object[0]);
                return;
            }
            webViewCallback.error(IntentError.ACTIVITY_WAS_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(IntentError.INTENT_WAS_NULL, new Object[0]);
    }

    public static void removeActiveActivity(Activity activity) {
        WeakReference<Activity> weakReference = _activeActivity;
        if (weakReference == null || weakReference.get() == null || activity == null || !activity.equals(_activeActivity.get())) {
            return;
        }
        _activeActivity = null;
    }

    public static void setActiveActivity(Activity activity) {
        if (activity == null) {
            _activeActivity = null;
        } else {
            _activeActivity = new WeakReference<>(activity);
        }
    }

    private static boolean setCategories(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return true;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                intent.addCategory(jSONArray.getString(i10));
            } catch (Exception e10) {
                DeviceLog.exception("Couldn't parse categories for intent", e10);
                return false;
            }
        }
        return true;
    }

    private static boolean setExtra(android.content.Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Double) {
            intent.putExtra(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof Boolean) {
            intent.putExtra(str, ((Boolean) obj).booleanValue());
            return true;
        } else {
            DeviceLog.error("Unable to parse launch intent extra " + str);
            return false;
        }
    }

    private static boolean setExtras(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (!setExtra(intent, jSONObject.getString("key"), jSONObject.get(AppMeasurementSdk.ConditionalUserProperty.VALUE))) {
                        return false;
                    }
                } catch (Exception e10) {
                    DeviceLog.exception("Couldn't parse extras", e10);
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
