package yb;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes3.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    private String f39513a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f39513a == null) {
            this.f39513a = b(context);
        }
        return "".equals(this.f39513a) ? null : this.f39513a;
    }
}
