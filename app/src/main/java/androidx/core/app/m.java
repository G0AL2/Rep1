package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f2593a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f2594b;

    /* renamed from: c  reason: collision with root package name */
    String f2595c;

    /* renamed from: d  reason: collision with root package name */
    String f2596d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2597e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2598f;

    public IconCompat a() {
        return this.f2594b;
    }

    public String b() {
        return this.f2596d;
    }

    public CharSequence c() {
        return this.f2593a;
    }

    public String d() {
        return this.f2595c;
    }

    public boolean e() {
        return this.f2597e;
    }

    public boolean f() {
        return this.f2598f;
    }

    public String g() {
        String str = this.f2595c;
        if (str != null) {
            return str;
        }
        if (this.f2593a != null) {
            return "name:" + ((Object) this.f2593a);
        }
        return "";
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().p() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
