package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static m f8257a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f8258b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f8259c;

    public e(m mVar) {
        this.f8259c = mVar.L().getSharedPreferences("com.applovin.sdk.preferences." + mVar.z(), 0);
        if (mVar.e()) {
            return;
        }
        f8257a = mVar;
    }

    private static SharedPreferences a(Context context) {
        if (f8258b == null) {
            f8258b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f8258b;
    }

    public static <T> T a(String str, T t10, Class cls, SharedPreferences sharedPreferences) {
        Object string;
        long j10;
        int i10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    string = Boolean.valueOf(t10 != null ? sharedPreferences.getBoolean(str, ((Boolean) t10).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    string = Float.valueOf(t10 != null ? sharedPreferences.getFloat(str, ((Float) t10).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t10 != null) {
                        i10 = sharedPreferences.getInt(str, t10.getClass().equals(Long.class) ? ((Long) t10).intValue() : ((Integer) t10).intValue());
                    } else {
                        i10 = sharedPreferences.getInt(str, 0);
                    }
                    string = Integer.valueOf(i10);
                } else if (Long.class.equals(cls)) {
                    if (t10 != null) {
                        j10 = sharedPreferences.getLong(str, t10.getClass().equals(Integer.class) ? ((Integer) t10).longValue() : ((Long) t10).longValue());
                    } else {
                        j10 = sharedPreferences.getLong(str, 0L);
                    }
                    string = Long.valueOf(j10);
                } else if (Double.class.equals(cls)) {
                    string = Double.valueOf(t10 != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t10).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                } else {
                    string = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t10) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t10) : t10;
                }
                return string != null ? (T) cls.cast(string) : t10;
            }
            return t10;
        } catch (Throwable th) {
            try {
                if (v.a()) {
                    v.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                }
                return t10;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            m mVar = f8257a;
            if (mVar != null && ((Boolean) mVar.a(b.eJ)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                } else if (f8257a.S() != null) {
                    f8257a.S().a(new z(f8257a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            editor.commit();
                        }
                    }), o.a.BACKGROUND);
                }
            }
            editor.apply();
        } catch (Throwable th) {
            if (v.a()) {
                v.c("SharedPreferencesManager", "Unable to apply changes", th);
            }
        }
    }

    public static <T> void a(d<T> dVar, T t10, Context context) {
        a(dVar.a(), t10, a(context), (SharedPreferences.Editor) null);
    }

    public static <T> void a(String str, T t10, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z10 = true;
        boolean z11 = editor != null;
        if (!z11) {
            editor = sharedPreferences.edit();
        }
        if (t10 == null) {
            editor.remove(str);
        } else if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        } else if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        } else if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        } else {
            if (t10 instanceof Long) {
                doubleToRawLongBits = ((Long) t10).longValue();
            } else if (t10 instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t10).doubleValue());
            } else if (t10 instanceof String) {
                editor.putString(str, (String) t10);
            } else if (t10 instanceof Set) {
                editor.putStringSet(str, (Set) t10);
            } else {
                if (v.a()) {
                    v.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t10);
                }
                z10 = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (!z10 || z11) {
            return;
        }
        a(editor);
    }

    public static <T> T b(d<T> dVar, T t10, Context context) {
        return (T) a(dVar.a(), t10, dVar.b(), a(context));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public <T> void a(d<T> dVar) {
        a(this.f8259c.edit().remove(dVar.a()));
    }

    public <T> void a(d<T> dVar, T t10) {
        a((d<d<T>>) dVar, (d<T>) t10, this.f8259c);
    }

    public <T> void a(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        a(dVar.a(), (String) t10, sharedPreferences);
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        a(str, t10, (SharedPreferences) null, editor);
    }

    public <T> void a(String str, T t10, SharedPreferences sharedPreferences) {
        a(str, t10, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public <T> T b(d<T> dVar, T t10) {
        return (T) b((d<d<T>>) dVar, (d<T>) t10, this.f8259c);
    }

    public <T> T b(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t10, dVar.b(), sharedPreferences);
    }
}
