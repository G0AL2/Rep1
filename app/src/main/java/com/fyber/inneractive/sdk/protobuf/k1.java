package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public final class k1 {
    public static String a(i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            byte c10 = iVar.c(i10);
            if (c10 == 34) {
                sb2.append("\\\"");
            } else if (c10 == 39) {
                sb2.append("\\'");
            } else if (c10 != 92) {
                switch (c10) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (c10 >= 32 && c10 <= 126) {
                            sb2.append((char) c10);
                            continue;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((c10 >>> 6) & 3) + 48));
                            sb2.append((char) (((c10 >>> 3) & 7) + 48));
                            sb2.append((char) ((c10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
