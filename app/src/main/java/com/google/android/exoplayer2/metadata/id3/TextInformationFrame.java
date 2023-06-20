package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.b2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f21209b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21210c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<TextInformationFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f21209b = str2;
        this.f21210c = str3;
    }

    private static List<Integer> c(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void Z0(b2.b bVar) {
        String str = this.f21198a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.M(this.f21210c);
                    return;
                case 1:
                case 11:
                    bVar.R(this.f21210c);
                    return;
                case 2:
                case '\f':
                    bVar.d0(Integer.valueOf(Integer.parseInt(this.f21210c.substring(2, 4)))).c0(Integer.valueOf(Integer.parseInt(this.f21210c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.N(this.f21210c);
                    return;
                case 4:
                case 18:
                    bVar.L(this.f21210c);
                    return;
                case 5:
                case 19:
                    bVar.S(this.f21210c);
                    return;
                case 6:
                case 20:
                    String[] R0 = n0.R0(this.f21210c, "/");
                    bVar.n0(Integer.valueOf(Integer.parseInt(R0[0]))).m0(R0.length > 1 ? Integer.valueOf(Integer.parseInt(R0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.k0(this.f21210c);
                    return;
                case '\b':
                case 15:
                    bVar.p0(this.f21210c);
                    return;
                case '\t':
                case 21:
                    bVar.e0(Integer.valueOf(Integer.parseInt(this.f21210c)));
                    return;
                case '\r':
                    List<Integer> c11 = c(this.f21210c);
                    int size = c11.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            bVar.c0(c11.get(2));
                        }
                        bVar.d0(c11.get(1));
                    }
                    bVar.e0(c11.get(0));
                    return;
                case 14:
                    List<Integer> c12 = c(this.f21210c);
                    int size2 = c12.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            bVar.f0(c12.get(2));
                        }
                        bVar.g0(c12.get(1));
                    }
                    bVar.h0(c12.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return n0.c(this.f21198a, textInformationFrame.f21198a) && n0.c(this.f21209b, textInformationFrame.f21209b) && n0.c(this.f21210c, textInformationFrame.f21210c);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21198a.hashCode()) * 31;
        String str = this.f21209b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21210c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f21198a;
        String str2 = this.f21209b;
        String str3 = this.f21210c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21198a);
        parcel.writeString(this.f21209b);
        parcel.writeString(this.f21210c);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f21209b = parcel.readString();
        this.f21210c = (String) n0.j(parcel.readString());
    }
}
