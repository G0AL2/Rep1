package sb;

import com.google.android.gms.internal.p002firebaseauthapi.zzwp;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class m0 implements com.google.firebase.auth.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f36941a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36942b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36943c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public m0(zzwp zzwpVar) {
        char c10;
        this.f36942b = zzwpVar.zzh() ? zzwpVar.zzd() : zzwpVar.zzc();
        this.f36943c = zzwpVar.zzc();
        if (!zzwpVar.zzi()) {
            this.f36941a = 3;
            return;
        }
        String zze = zzwpVar.zze();
        switch (zze.hashCode()) {
            case -1874510116:
                if (zze.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1452371317:
                if (zze.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (zze.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (zze.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (zze.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 970484929:
                if (zze.equals("RECOVER_EMAIL")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        int i10 = c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? c10 != 5 ? 3 : 6 : 2 : 5 : 4 : 1 : 0;
        this.f36941a = i10;
        if (i10 == 4 || i10 == 3) {
            return;
        }
        if (zzwpVar.zzg()) {
            new l0(zzwpVar.zzc(), q.a(zzwpVar.zzb()));
        } else if (zzwpVar.zzh()) {
            new j0(zzwpVar.zzd(), zzwpVar.zzc());
        } else if (zzwpVar.zzf()) {
            new k0(zzwpVar.zzc());
        }
    }

    @Override // com.google.firebase.auth.d
    public final String a(int i10) {
        if (this.f36941a == 4) {
            return null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f36943c;
        }
        return this.f36942b;
    }

    @Override // com.google.firebase.auth.d
    public final int b() {
        return this.f36941a;
    }
}
