package androidx.room;

/* compiled from: RoomMasterTable.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f3953a = new l0();

    private l0() {
    }

    public static final String a(String str) {
        qe.k.f(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
