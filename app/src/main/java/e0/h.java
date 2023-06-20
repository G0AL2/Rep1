package e0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f29480a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(LocaleList localeList) {
        this.f29480a = localeList;
    }

    @Override // e0.g
    public Object a() {
        return this.f29480a;
    }

    public boolean equals(Object obj) {
        return this.f29480a.equals(((g) obj).a());
    }

    @Override // e0.g
    public Locale get(int i10) {
        return this.f29480a.get(i10);
    }

    public int hashCode() {
        return this.f29480a.hashCode();
    }

    public String toString() {
        return this.f29480a.toString();
    }
}
