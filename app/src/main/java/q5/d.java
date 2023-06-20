package q5;

/* compiled from: Priority.java */
/* loaded from: classes.dex */
public enum d {
    LOW,
    MEDIUM,
    HIGH;

    public static d a(d dVar, d dVar2) {
        return dVar.ordinal() > dVar2.ordinal() ? dVar : dVar2;
    }
}
