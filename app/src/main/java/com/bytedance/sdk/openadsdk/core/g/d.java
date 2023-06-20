package com.bytedance.sdk.openadsdk.core.g;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.core.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PermissionsManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12258a = "d";

    /* renamed from: e  reason: collision with root package name */
    private static d f12259e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f12260f = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f12261b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private final List<WeakReference<e>> f12262c = new ArrayList(1);

    /* renamed from: d  reason: collision with root package name */
    private final List<e> f12263d = new ArrayList(1);

    private d() {
        b();
    }

    public static d a() {
        if (f12259e == null) {
            f12259e = new d();
        }
        return f12259e;
    }

    private synchronized void b() {
        if (Build.VERSION.SDK_INT > 28) {
            c();
            return;
        }
        for (Field field : Manifest.permission.class.getFields()) {
            String str = null;
            try {
                str = (String) field.get("");
            } catch (IllegalAccessException e10) {
                Log.e(f12258a, "Could not access field", e10);
            }
            this.f12261b.add(str);
        }
    }

    private void c() {
        PackageInfo packageInfo;
        String[] strArr;
        Context a10 = m.a();
        if (a10 == null) {
            return;
        }
        try {
            PackageManager packageManager = a10.getPackageManager();
            String packageName = a10.getPackageName();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(packageName, 4096)) != null && (strArr = packageInfo.requestedPermissions) != null && strArr.length != 0) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (!TextUtils.isEmpty(strArr[i10])) {
                        this.f12261b.add(strArr[i10]);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void a(String[] strArr, e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.a(strArr);
        this.f12263d.add(eVar);
        this.f12262c.add(new WeakReference<>(eVar));
    }

    private synchronized void a(e eVar) {
        Iterator<WeakReference<e>> it = this.f12262c.iterator();
        while (it.hasNext()) {
            WeakReference<e> next = it.next();
            if (next.get() == eVar || next.get() == null) {
                it.remove();
            }
        }
        Iterator<e> it2 = this.f12263d.iterator();
        while (it2.hasNext()) {
            if (it2.next() == eVar) {
                it2.remove();
            }
        }
    }

    private void b(Activity activity, String[] strArr, e eVar) {
        boolean a10;
        for (String str : strArr) {
            if (eVar != null) {
                try {
                    if (!this.f12261b.contains(str)) {
                        a10 = eVar.a(str, c.NOT_FOUND);
                    } else if (b.a(activity, str) != 0) {
                        a10 = eVar.a(str, c.DENIED);
                    } else {
                        a10 = eVar.a(str, c.GRANTED);
                    }
                    if (a10) {
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        a(eVar);
    }

    private List<String> c(Activity activity, String[] strArr, e eVar) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (this.f12261b.contains(str)) {
                if (!a(activity, str)) {
                    arrayList.add(str);
                } else if (eVar != null) {
                    eVar.a(str, c.GRANTED);
                }
            } else if (eVar != null) {
                eVar.a(str, c.NOT_FOUND);
            }
        }
        return arrayList;
    }

    public synchronized boolean a(Context context, String str) {
        boolean z10 = false;
        if (context == null) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.utils.m.e()) {
            if (a.a(context, str) && (b.a(context, str) == 0 || !this.f12261b.contains(str))) {
                z10 = true;
            }
            return z10;
        }
        return (b.a(context, str) == 0 || !this.f12261b.contains(str)) ? true : true;
    }

    public synchronized void a(Activity activity, String[] strArr, e eVar) {
        if (activity == null) {
            return;
        }
        try {
            a(strArr, eVar);
            if (Build.VERSION.SDK_INT < 23) {
                b(activity, strArr, eVar);
            } else {
                List<String> c10 = c(activity, strArr, eVar);
                if (c10.isEmpty()) {
                    a(eVar);
                } else {
                    b.a(activity, (String[]) c10.toArray(new String[c10.size()]), 1);
                }
            }
        } finally {
        }
    }

    public synchronized void a(Activity activity, String[] strArr, int[] iArr) {
        try {
            new ArrayList(3);
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr[i10];
                if ((iArr[i10] == -1 || (com.bytedance.sdk.openadsdk.utils.m.e() && !a.a(activity, str))) && iArr[i10] != -1) {
                    iArr[i10] = -1;
                }
            }
            a(strArr, iArr, (String[]) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String[] strArr, int[] iArr, String[] strArr2) {
        int i10;
        try {
            int length = strArr.length;
            if (iArr.length < length) {
                length = iArr.length;
            }
            Iterator<WeakReference<e>> it = this.f12262c.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                while (i10 < length) {
                    i10 = (eVar == null || eVar.a(strArr[i10], iArr[i10])) ? 0 : i10 + 1;
                    it.remove();
                    break;
                }
            }
            Iterator<e> it2 = this.f12263d.iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
