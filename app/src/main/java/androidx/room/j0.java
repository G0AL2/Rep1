package androidx.room;

import android.content.Context;
import androidx.room.k0;

/* compiled from: Room.kt */
/* loaded from: classes.dex */
public final class j0 {
    static {
        new j0();
    }

    private j0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.room.k0> androidx.room.k0.a<T> a(android.content.Context r2, java.lang.Class<T> r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            qe.k.f(r2, r0)
            java.lang.String r0 = "klass"
            qe.k.f(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = ve.g.n(r4)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            r0 = r0 ^ r1
            if (r0 == 0) goto L20
            androidx.room.k0$a r0 = new androidx.room.k0$a
            r0.<init>(r2, r3, r4)
            return r0
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j0.a(android.content.Context, java.lang.Class, java.lang.String):androidx.room.k0$a");
    }

    public static final <T, C> T b(Class<C> cls, String str) {
        String t10;
        String str2;
        qe.k.f(cls, "klass");
        qe.k.f(str, "suffix");
        Package r12 = cls.getPackage();
        qe.k.c(r12);
        String name = r12.getName();
        String canonicalName = cls.getCanonicalName();
        qe.k.c(canonicalName);
        qe.k.e(name, "fullPackage");
        if (!(name.length() == 0)) {
            canonicalName = canonicalName.substring(name.length() + 1);
            qe.k.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        StringBuilder sb2 = new StringBuilder();
        t10 = ve.p.t(str3, '.', '_', false, 4, null);
        sb2.append(t10);
        sb2.append(str);
        String sb3 = sb2.toString();
        try {
            if (name.length() == 0) {
                str2 = sb3;
            } else {
                str2 = name + '.' + sb3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            qe.k.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + sb3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final <T extends k0> k0.a<T> c(Context context, Class<T> cls) {
        qe.k.f(context, "context");
        qe.k.f(cls, "klass");
        return new k0.a<>(context, cls, null);
    }
}
