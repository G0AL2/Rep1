package x0;

import z0.g;

/* compiled from: Migration.java */
/* loaded from: classes.dex */
public abstract class b {
    public final int endVersion;
    public final int startVersion;

    public b(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public abstract void migrate(g gVar);
}
