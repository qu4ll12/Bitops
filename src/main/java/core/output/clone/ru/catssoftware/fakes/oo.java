package core.output.clone.ru.catssoftware.fakes;
import java.math.BigInteger;
import static core.TestGeneration.path.MarkedPath.markOneStatement;
public class oo extends Thread {
private static volatile Object[] x;

private final int a;

private static final BigInteger[] O=new BigInteger[1];

oo(int var1){
  this.a=var1;
}
public void run() {
{
markOneStatement("a(this.a,(Object)null);\n", false, false, 293);
a(this.a,(Object)null);
}

}
public static final void a(int var0, Object var1) {
{
markOneStatement("BigInteger[] var2;\n", false, false, 386);
BigInteger[] var2;
markOneStatement("BigInteger var3;\n", false, false, 411);
BigInteger var3;
markOneStatement("BigInteger var4;\n", false, false, 434);
BigInteger var4;
markOneStatement("BigInteger var5;\n", false, false, 457);
BigInteger var5;
markOneStatement("BigInteger var6;\n", false, false, 480);
BigInteger var6;
markOneStatement("BigInteger var7;\n", false, false, 503);
BigInteger var7;
markOneStatement("int var8;\n", false, false, 526);
int var8;
markOneStatement("int var9;\n", false, false, 542);
int var9;
markOneStatement("int[] var10000;\n", false, false, 558);
int[] var10000;
markOneStatement("int[] var25;\n", false, false, 580);
int[] var25;
markOneStatement("byte[] var26;\n", false, false, 599);
byte[] var26;
markOneStatement("int var28;\n", false, false, 619);
int var28;
markOneStatement("int[] var29;\n", false, false, 636);
int[] var29;
markOneStatement("int var31;\n", false, false, 655);
int var31;
markOneStatement("byte[] var34;\n", false, false, 672);
byte[] var34;
markOneStatement("int var36;\n", false, false, 692);
int var36;
markOneStatement("int[] var38;\n", false, false, 709);
int[] var38;
markOneStatement("int[] var40;\n", false, false, 728);
int[] var40;
markOneStatement("int var41;\n", false, false, 747);
int var41;
markOneStatement("int[] var42;\n", false, false, 764);
int[] var42;
markOneStatement("switch (var0) {\ncase 0:\n  var26=new byte[256];\nvar29=new int[256];\nvar40=new int[256];\nvar42=new int[256];\nvar38=new int[256];\nx=new Object[]{var26,var29,var40,var42,var38,null,null,null};\nbreak;\ncase 1:\nvar25=new int[256];\nvar28=0;\nfor (var31=1; var28 < 256; ++var28) {\nvar25[var28]=var31;\nvar31^=var31 << 1 ^ (var31 >>> 7) * 283;\n}\na(2,var25);\nbreak;\ncase 2:\nvar26=(byte[])((byte[])x[0]);\nvar26[0]=99;\nvar29=(int[])((int[])var1);\nfor (var31=0; var31 < 255; ++var31) {\nvar36=var29[255 - var31];\nvar36|=var36 << 8;\nvar36^=var36 >> 4 ^ var36 >> 5 ^ var36 >> 6 ^ var36 >> 7;\nvar26[var29[var31]]=(byte)(var36 ^ 99);\n}\nvar40=(int[])((int[])x[1]);\nvar42=(int[])((int[])x[2]);\nvar38=(int[])((int[])x[3]);\nint[] var43=(int[])((int[])x[4]);\nfor (var8=0; var8 < 256; ++var8) {\nvar9=var26[var8] & 255;\nint var10=var9 << 1 ^ (var9 >>> 7) * 283;\nint var11=(var9 ^ var10) << 24 ^ var9 << 16 ^ var9 << 8 ^ var10;\nvar11&=-1;\nvar40[var8]=var11;\nvar42[var8]=var11 << 8 | var11 >>> -8;\nvar38[var8]=var11 << 16 | var11 >>> -16;\nvar43[var8]=var11 << 24 | var11 >>> -24;\n}\nreturn;\ncase 3:\nchar[] var27=\"숢�?�鉺�?�?\\uf156�?�?�豎ꌞⳑ∀\\uf6c3ᛤ\\ue043梻휲鳷얿\\u08c6\\u202e驥굦酩䈿뒃噇钭\\u1df5剥쮧펉�?�ꆣ鉡\\udffe㥭饗⟙瓊⨢룧\\ue87f溭穯꓀唫玛핣괉㟔穜춠ᄵ�?ᬮˡ╮�?�臚忚\\uf14f릣﹙ᑸ\\ueaaa䗣붗츻爾檠\\ude31�?闔梼\\uf26c�?�\\ue5d8ᅤ㕯鄟쮬�?�?�?�韼闺\\udc2c뼼�?�\\ue65bꗫꗻꦔ嗹瓱⾲\\ued5c嚂ҽ漴ш�?뫳ꂸ䡧ڠ옩턬蓂骀渑녻䪢\\udda0侷\\ue393\\uda41怩\\uf1b6\\uaafb\\u000e霦ꪛᬹ㔀홿邷\".toCharArray();\nbyte[] var33=new byte[var27.length * 2];\nfor (var31=0; var31 < var27.length; ++var31) {\nvar33[var31 * 2]=(byte)(var27[var31] & 255);\nvar33[var31 * 2 + 1]=(byte)((var27[var31] & '\\uff00') >> 8);\n}\nvar27=\"뙳깼Ƨ�?죶洧뎀\\uf73f质�?骋볰슼�?\\ue3e2輶�?�桰੬뙷௦�?�磽⪃퇺煨\\ue6b8\\u2d9d질\\udf48陼ꄖ㾋\\uf697籜曢욾�?좩찉�?�㌃⺥램稸汫뼗ꇢ\\u17ea誻樛쿹դ៵\\uf122蠸�?�?ᑳ�??눿꺘⩠욨藰摨⚦\\ufaf4࿉좗⬼⸬둓䵼\\uf1ce�?�?䮿�?ꖅݠံ雋薻\\uf682꞉\\udcf4뇵郭ኗ\\udc5b齮잰囅�??�?�?�䰯쫯ꫯ\\u1ade혙爙툟�?�ห迧ꯦ䛎撟붺�?蔋롥\\ue10b苜�?숳滰箆\\uee36㒯�?璙�?焀圆팕\".toCharArray();\nvar34=new byte[var27.length * 2];\nfor (var36=0; var36 < var27.length; ++var36) {\nvar34[var36 * 2]=(byte)(var27[var36] & 255);\nvar34[var36 * 2 + 1]=(byte)((var27[var36] & '\\uff00') >> 8);\n}\nbyte[] var39=new byte[16];\ntry {\nvar39[0]=var33[var34[151] & 255];\nvar39[1]=var33[var34[157] & 255];\nvar39[2]=var33[var34[24] & 255];\nvar39[3]=var33[var34[58] & 255];\nvar39[4]=var33[var34[174] & 255];\nvar39[5]=var33[var34[13] & 255];\nvar39[6]=var33[var34[164] & 255];\nvar39[7]=var33[var34[81] & 255];\n}\n catch (Exception var20) {\n}\n finally {\nvar39[8]=var33[var34[62] & 255];\nvar39[9]=var33[var34[208] & 255];\nvar39[10]=var33[var34[76] & 255];\nvar39[11]=var33[var34[245] & 255];\nvar39[12]=var33[var34[171] & 255];\nvar39[13]=var33[var34[40] & 255];\nvar39[14]=var33[var34[84] & 255];\nvar39[15]=var33[var34[100] & 255];\n}\na(5,var39);\nbreak;\ncase 4:\nvar25=new int[]{-2131026528,2064971577,-434146728,913206942};\nlong var32=0L ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1L;\nvar25[2]^=(int)var32;\nx[6]=var25;\nbreak;\ncase 5:\nvar26=(byte[])((byte[])var1);\nbyte var30=4;\nvar36=var30 + 6;\nvar38=new int[(var36 + 1) * 4];\nvar31=0;\nvar41=0;\ntry {\nwhile (var41 < 16) {\nvar38[(var31 >> 2) * 4 + var31 & 3]=var26[var41] & 255 | (var26[var41 + 1] & 255) << 8 | (var26[var41 + 2] & 255) << 16 | var26[var41 + 3] << 24;\nvar41+=4;\n++var31;\n}\n}\n catch (Exception var24) {\n}\nx[5]=var38;\na(6,(Object)null);\nbreak;\ncase 6:\nvar25=new int[30];\nvar28=0;\nfor (var31=1; var28 < 30; ++var28) {\nvar25[var28]=var31;\nvar31=var31 << 1 ^ (var31 >>> 7) * 283;\n}\nvar29=(int[])((int[])x[5]);\nvar34=(byte[])((byte[])x[0]);\nbyte var35=44;\nfor (int var37=4; var37 < var35; ++var37) {\nvar41=var29[(var37 - 1 >> 2) * 4 + (var37 - 1 & 3)];\nif (var37 % 4 == 0) {\nvar41=j(var34,Z(var41,8)) ^ var25[var37 / 4 - 1];\n}\nvar29[(var37 >> 2) * 4 + (var37 & 3)]=var29[(var37 - 4 >> 2) * 4 + (var37 - 4 & 3)] ^ var41;\n}\nreturn;\ncase 7:\nvar2=O;\nvar3=new BigInteger(\"10001\",16);\nvar4=new BigInteger(\"2kqjk8eiefdc\",36);\nvar5=new BigInteger(\"1eub0lzbhr92l\",36);\nvar6=new BigInteger(\"g3onrerw9n6z\",36);\nvar7=new BigInteger(\"1vw4x0jid475v\",36);\nfor (var8=0; var8 < 4; ++var8) {\nfor (var9=0; var9 < 8; ++var9) {\nvar7=var7.add(var5).xor(var6).modPow(var3,var4);\n}\nsynchronized (var2) {\nwhile (var2[0] == null) {\nvar2.wait(5000L);\n}\nvar5=var5.xor(var2[0]);\nvar2[0]=null;\n}\n}\nvar10000=(int[])((int[])x[6]);\nvar10000[0]^=var7.intValue();\nbreak;\ncase 8:\nvar2=O;\nvar3=new BigInteger(\"10001\",16);\nvar4=new BigInteger(\"1xy8r8vcgcvbv\",36);\nvar5=new BigInteger(\"g79r256qrals\",36);\nvar6=new BigInteger(\"prrr2de3n0c9\",36);\nvar7=new BigInteger(\"194s390t593gm\",36);\nfor (var8=0; var8 < 4; ++var8) {\nfor (var9=0; var9 < 8; ++var9) {\nvar7=var7.add(var5).xor(var6).modPow(var3,var4);\n}\nwhile (true) {\nThread.yield();\nsynchronized (var2) {\nif (var2[0] == null) {\nvar2[0]=var7;\nvar2.notifyAll();\nbreak;\n}\nvar2.notifyAll();\n}\n}\n}\nvar10000=(int[])((int[])x[6]);\nvar10000[1]^=var7.intValue();\n}\n", false, false, 783);
switch (var0) {
case 0:
  var26=new byte[256];
var29=new int[256];
var40=new int[256];
var42=new int[256];
var38=new int[256];
x=new Object[]{var26,var29,var40,var42,var38,null,null,null};
break;
case 1:
var25=new int[256];
var28=0;
for (var31=1; var28 < 256; ++var28) {
var25[var28]=var31;
var31^=var31 << 1 ^ (var31 >>> 7) * 283;
}
a(2,var25);
break;
case 2:
var26=(byte[])((byte[])x[0]);
var26[0]=99;
var29=(int[])((int[])var1);
for (var31=0; var31 < 255; ++var31) {
var36=var29[255 - var31];
var36|=var36 << 8;
var36^=var36 >> 4 ^ var36 >> 5 ^ var36 >> 6 ^ var36 >> 7;
var26[var29[var31]]=(byte)(var36 ^ 99);
}
var40=(int[])((int[])x[1]);
var42=(int[])((int[])x[2]);
var38=(int[])((int[])x[3]);
int[] var43=(int[])((int[])x[4]);
for (var8=0; var8 < 256; ++var8) {
var9=var26[var8] & 255;
int var10=var9 << 1 ^ (var9 >>> 7) * 283;
int var11=(var9 ^ var10) << 24 ^ var9 << 16 ^ var9 << 8 ^ var10;
var11&=-1;
var40[var8]=var11;
var42[var8]=var11 << 8 | var11 >>> -8;
var38[var8]=var11 << 16 | var11 >>> -16;
var43[var8]=var11 << 24 | var11 >>> -24;
}
return;
case 3:
char[] var27="숢�?�鉺�?�?\uf156�?�?�豎ꌞⳑ∀\uf6c3ᛤ\ue043梻휲鳷얿\u08c6\u202e驥굦酩䈿뒃噇钭\u1df5剥쮧펉�?�ꆣ鉡\udffe㥭饗⟙瓊⨢룧\ue87f溭穯꓀唫玛핣괉㟔穜춠ᄵ�?ᬮˡ╮�?�臚忚\uf14f릣﹙ᑸ\ueaaa䗣붗츻爾檠\ude31�?闔梼\uf26c�?�\ue5d8ᅤ㕯鄟쮬�?�?�?�韼闺\udc2c뼼�?�\ue65bꗫꗻꦔ嗹瓱⾲\ued5c嚂ҽ漴ш�?뫳ꂸ䡧ڠ옩턬蓂骀渑녻䪢\udda0侷\ue393\uda41怩\uf1b6\uaafb\u000e霦ꪛᬹ㔀홿邷".toCharArray();
byte[] var33=new byte[var27.length * 2];
for (var31=0; var31 < var27.length; ++var31) {
var33[var31 * 2]=(byte)(var27[var31] & 255);
var33[var31 * 2 + 1]=(byte)((var27[var31] & '\uff00') >> 8);
}
var27="뙳깼Ƨ�?죶洧뎀\uf73f质�?骋볰슼�?\ue3e2輶�?�桰੬뙷௦�?�磽⪃퇺煨\ue6b8\u2d9d질\udf48陼ꄖ㾋\uf697籜曢욾�?좩찉�?�㌃⺥램稸汫뼗ꇢ\u17ea誻樛쿹դ៵\uf122蠸�?�?ᑳ�??눿꺘⩠욨藰摨⚦\ufaf4࿉좗⬼⸬둓䵼\uf1ce�?�?䮿�?ꖅݠံ雋薻\uf682꞉\udcf4뇵郭ኗ\udc5b齮잰囅�??�?�?�䰯쫯ꫯ\u1ade혙爙툟�?�ห迧ꯦ䛎撟붺�?蔋롥\ue10b苜�?숳滰箆\uee36㒯�?璙�?焀圆팕".toCharArray();
var34=new byte[var27.length * 2];
for (var36=0; var36 < var27.length; ++var36) {
var34[var36 * 2]=(byte)(var27[var36] & 255);
var34[var36 * 2 + 1]=(byte)((var27[var36] & '\uff00') >> 8);
}
byte[] var39=new byte[16];
try {
var39[0]=var33[var34[151] & 255];
var39[1]=var33[var34[157] & 255];
var39[2]=var33[var34[24] & 255];
var39[3]=var33[var34[58] & 255];
var39[4]=var33[var34[174] & 255];
var39[5]=var33[var34[13] & 255];
var39[6]=var33[var34[164] & 255];
var39[7]=var33[var34[81] & 255];
}
 catch (Exception var20) {
}
 finally {
var39[8]=var33[var34[62] & 255];
var39[9]=var33[var34[208] & 255];
var39[10]=var33[var34[76] & 255];
var39[11]=var33[var34[245] & 255];
var39[12]=var33[var34[171] & 255];
var39[13]=var33[var34[40] & 255];
var39[14]=var33[var34[84] & 255];
var39[15]=var33[var34[100] & 255];
}
a(5,var39);
break;
case 4:
var25=new int[]{-2131026528,2064971577,-434146728,913206942};
long var32=0L ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1L;
var25[2]^=(int)var32;
x[6]=var25;
break;
case 5:
var26=(byte[])((byte[])var1);
byte var30=4;
var36=var30 + 6;
var38=new int[(var36 + 1) * 4];
var31=0;
var41=0;
try {
while (var41 < 16) {
var38[(var31 >> 2) * 4 + var31 & 3]=var26[var41] & 255 | (var26[var41 + 1] & 255) << 8 | (var26[var41 + 2] & 255) << 16 | var26[var41 + 3] << 24;
var41+=4;
++var31;
}
}
 catch (Exception var24) {
}
x[5]=var38;
a(6,(Object)null);
break;
case 6:
var25=new int[30];
var28=0;
for (var31=1; var28 < 30; ++var28) {
var25[var28]=var31;
var31=var31 << 1 ^ (var31 >>> 7) * 283;
}
var29=(int[])((int[])x[5]);
var34=(byte[])((byte[])x[0]);
byte var35=44;
for (int var37=4; var37 < var35; ++var37) {
var41=var29[(var37 - 1 >> 2) * 4 + (var37 - 1 & 3)];
if (var37 % 4 == 0) {
var41=j(var34,Z(var41,8)) ^ var25[var37 / 4 - 1];
}
var29[(var37 >> 2) * 4 + (var37 & 3)]=var29[(var37 - 4 >> 2) * 4 + (var37 - 4 & 3)] ^ var41;
}
return;
case 7:
var2=O;
var3=new BigInteger("10001",16);
var4=new BigInteger("2kqjk8eiefdc",36);
var5=new BigInteger("1eub0lzbhr92l",36);
var6=new BigInteger("g3onrerw9n6z",36);
var7=new BigInteger("1vw4x0jid475v",36);
for (var8=0; var8 < 4; ++var8) {
for (var9=0; var9 < 8; ++var9) {
var7=var7.add(var5).xor(var6).modPow(var3,var4);
}
synchronized (var2) {
while (var2[0] == null) {
var2.wait(5000L);
}
var5=var5.xor(var2[0]);
var2[0]=null;
}
}
var10000=(int[])((int[])x[6]);
var10000[0]^=var7.intValue();
break;
case 8:
var2=O;
var3=new BigInteger("10001",16);
var4=new BigInteger("1xy8r8vcgcvbv",36);
var5=new BigInteger("g79r256qrals",36);
var6=new BigInteger("prrr2de3n0c9",36);
var7=new BigInteger("194s390t593gm",36);
for (var8=0; var8 < 4; ++var8) {
for (var9=0; var9 < 8; ++var9) {
var7=var7.add(var5).xor(var6).modPow(var3,var4);
}
while (true) {
Thread.yield();
synchronized (var2) {
if (var2[0] == null) {
var2[0]=var7;
var2.notifyAll();
break;
}
var2.notifyAll();
}
}
}
var10000=(int[])((int[])x[6]);
var10000[1]^=var7.intValue();
}
}

}
public static final int Z(int var0, int var1) {
{
markOneStatement("boolean var5=false;\n", false, false, 7984);
boolean var5=false;
markOneStatement("int var2=var0;\n", false, false, 8012);
int var2=var0;
markOneStatement("int var3=var1;\n", false, false, 8035);
int var3=var1;
markOneStatement("int var4=var1 + var0 >> 24;\n", false, false, 8058);
int var4=var1 + var0 >> 24;
markOneStatement("var5=false;\n", false, false, 8094);
var5=false;
markOneStatement("Object var10000=null;\n", false, false, 8114);
Object var10000=null;
while (true) {
markOneStatement("true", true, false, 8151);
{
markOneStatement("try {\n  if (!var5) {\n    var5=true;\n    var3=var0 >>> var1 | var0 << -var1;\n    return var3;\n  }\n}\n catch (Throwable var7) {\n  continue;\n}\n", false, false, 8168);
try {
  if (!var5) {
    var5=true;
    var3=var0 >>> var1 | var0 << -var1;
    return var3;
  }
}
 catch (Throwable var7) {
  continue;
}
markOneStatement("byte var8=0;\n", false, false, 8401);
byte var8=0;
markOneStatement("var10000=null;\n", false, false, 8425);
var10000=null;
while (true) {
markOneStatement("true", true, false, 8458);
{
markOneStatement("try {\n  if (var8 == 0) {\n    int var9=var8 + 1;\n    var3=var2 + var4;\n  }\n  return var3;\n}\n catch (Throwable var6) {\n}\n", false, false, 8478);
try {
  if (var8 == 0) {
    int var9=var8 + 1;
    var3=var2 + var4;
  }
  return var3;
}
 catch (Throwable var6) {
}
}
}
}
}
}

}
public static final int j(byte[] var0, int var1) {
{
markOneStatement("boolean var4=false;\n", false, false, 8778);
boolean var4=false;
markOneStatement("int var2=var0[10] << 16;\n", false, false, 8806);
int var2=var0[10] << 16;
markOneStatement("var4=false;\n", false, false, 8839);
var4=false;
markOneStatement("Object var10000=null;\n", false, false, 8859);
Object var10000=null;
while (true) {
markOneStatement("true", true, false, 8896);
{
markOneStatement("try {\n  if (!var4) {\n    var4=true;\n    var2=var0[var1 & 255] & 255 | (var0[var1 >> 8 & 255] & 255) << 8 | (var0[var1 >> 16 & 255] & 255) << 16 | var0[var1 >> 24 & 255] << 24;\n    return var2;\n  }\n}\n catch (Throwable var6) {\n  continue;\n}\n", false, false, 8913);
try {
  if (!var4) {
    var4=true;
    var2=var0[var1 & 255] & 255 | (var0[var1 >> 8 & 255] & 255) << 8 | (var0[var1 >> 16 & 255] & 255) << 16 | var0[var1 >> 24 & 255] << 24;
    return var2;
  }
}
 catch (Throwable var6) {
  continue;
}
markOneStatement("var4=false;\n", false, false, 9246);
var4=false;
markOneStatement("var10000=null;\n", false, false, 9269);
var10000=null;
while (true) {
markOneStatement("true", true, false, 9302);
{
markOneStatement("try {\n  if (!var4) {\n    var4=true;\n    var2=var0[var1 & 127] >> 8;\n  }\n  return var2;\n}\n catch (Throwable var5) {\n}\n", false, false, 9322);
try {
  if (!var4) {
    var4=true;
    var2=var0[var1 & 127] >> 8;
  }
  return var2;
}
 catch (Throwable var5) {
}
}
}
}
}
}

}
public static final void w24561() {
{
markOneStatement("a(0,(Object)null);\n", false, false, 9605);
a(0,(Object)null);
markOneStatement("p();\n", false, false, 9631);
p();
markOneStatement("oo var0=new oo(1);\n", false, false, 9642);
oo var0=new oo(1);
markOneStatement("var0.start();\n", false, false, 9669);
var0.start();
markOneStatement("var0.join();\n", false, false, 9689);
var0.join();
markOneStatement("oo var1=new oo(3);\n", false, false, 9708);
oo var1=new oo(3);
markOneStatement("var1.start();\n", false, false, 9735);
var1.start();
markOneStatement("oo var2=new oo(4);\n", false, false, 9755);
oo var2=new oo(4);
markOneStatement("var2.start();\n", false, false, 9782);
var2.start();
markOneStatement("var1.join();\n", false, false, 9802);
var1.join();
markOneStatement("var2.join();\n", false, false, 9821);
var2.join();
markOneStatement("oo var3=new oo(7);\n", false, false, 9840);
oo var3=new oo(7);
markOneStatement("oo var4=new oo(8);\n", false, false, 9867);
oo var4=new oo(8);
markOneStatement("var3.start();\n", false, false, 9894);
var3.start();
markOneStatement("var4.start();\n", false, false, 9914);
var4.start();
markOneStatement("var3.join();\n", false, false, 9934);
var3.join();
markOneStatement("var4.join();\n", false, false, 9953);
var4.join();
}

}
public static final void p() {
{
markOneStatement("boolean var6=false;\n", false, false, 10013);
boolean var6=false;
markOneStatement("boolean var7=false;\n", false, false, 10041);
boolean var7=false;
markOneStatement("byte var13=0;\n", false, false, 10069);
byte var13=0;
markOneStatement("Throwable var10000=null;\n", false, false, 10091);
Throwable var10000=null;
markOneStatement("label72: while (var13 == 0) {\n  var13=2;\n  StackTraceElement[] var0=Thread.currentThread().getStackTrace();\n  int var1=var0.length;\n  int var2=-1324703194;\n  int var3=1;\n  while (var3 < var1) {\n    StringBuilder var4=new StringBuilder();\n    var6=false;\n    var10000=null;\n    try {\n      label94: {\n        boolean var10001;\n        label79: {\n          while (true) {\n            try {\n              try {\n                if (var6) {\n                  break;\n                }\n                var6=true;\n                var4=var4.append(var0[var3].getClassName()).append(var0[var3].getMethodName());\n              }\n catch (              Exception var10) {\n                continue;\n              }\n            }\n catch (            Throwable var11) {\n              var10000=var11;\n              var10001=false;\n              break label79;\n            }\n            if (var4.toString().hashCode() == var2) {\n              x[7]=var3;\n              return;\n            }\n            break label94;\n          }\n          try {\n            x[7]=4;\n          }\n catch (          Throwable var9) {\n            var10000=var9;\n            var10001=false;\n            break label79;\n          }\n          if (var4.toString().hashCode() == var2) {\n            x[7]=var3;\n            return;\n          }\n          break label94;\n        }\n        Throwable var5;\n        while (true) {\n          var5=var10000;\n          try {\n            var5=var5;\n            break;\n          }\n catch (          Throwable var8) {\n            var10000=var8;\n            var10001=false;\n          }\n        }\n        if (var4.toString().hashCode() != var2) {\n          throw var5;\n        }\n        x[7]=var3;\n        return;\n      }\n      ++var3;\n    }\n catch (    Exception var12) {\n      continue label72;\n    }\n  }\n  return;\n}\n", false, false, 10125);
label72: while (var13 == 0) {
  var13=2;
  StackTraceElement[] var0=Thread.currentThread().getStackTrace();
  int var1=var0.length;
  int var2=-1324703194;
  int var3=1;
  while (var3 < var1) {
    StringBuilder var4=new StringBuilder();
    var6=false;
    var10000=null;
    try {
      label94: {
        boolean var10001;
        label79: {
          while (true) {
            try {
              try {
                if (var6) {
                  break;
                }
                var6=true;
                var4=var4.append(var0[var3].getClassName()).append(var0[var3].getMethodName());
              }
 catch (              Exception var10) {
                continue;
              }
            }
 catch (            Throwable var11) {
              var10000=var11;
              var10001=false;
              break label79;
            }
            if (var4.toString().hashCode() == var2) {
              x[7]=var3;
              return;
            }
            break label94;
          }
          try {
            x[7]=4;
          }
 catch (          Throwable var9) {
            var10000=var9;
            var10001=false;
            break label79;
          }
          if (var4.toString().hashCode() == var2) {
            x[7]=var3;
            return;
          }
          break label94;
        }
        Throwable var5;
        while (true) {
          var5=var10000;
          try {
            var5=var5;
            break;
          }
 catch (          Throwable var8) {
            var10000=var8;
            var10001=false;
          }
        }
        if (var4.toString().hashCode() != var2) {
          throw var5;
        }
        x[7]=var3;
        return;
      }
      ++var3;
    }
 catch (    Exception var12) {
      continue label72;
    }
  }
  return;
}
markOneStatement("x[7]=3;\n", false, false, 12713);
x[7]=3;
}

}
static final String q(Object var0) {
{
markOneStatement("boolean var21=false;\n", false, false, 12775);
boolean var21=false;
markOneStatement("boolean var22=false;\n", false, false, 12804);
boolean var22=false;
if (((x == null) && markOneStatement("x == null", true, false, 12837)) || markOneStatement("x == null", false, true, 12837))
{
{
markOneStatement("w24561();\n", false, false, 12859);
w24561();
}
}
markOneStatement("StackTraceElement[] var10000=Thread.currentThread().getStackTrace();\n", false, false, 12884);
StackTraceElement[] var10000=Thread.currentThread().getStackTrace();
markOneStatement("StringBuilder var13=new StringBuilder();\n", false, false, 12961);
StringBuilder var13=new StringBuilder();
markOneStatement("String var12=var10000[(Integer)x[7]].getClassName();\n", false, false, 13010);
String var12=var10000[(Integer)x[7]].getClassName();
markOneStatement("var13=var13.append(var12);\n", false, false, 13071);
var13=var13.append(var12);
markOneStatement("var12=var10000[(Integer)x[7]].getMethodName();\n", false, false, 13106);
var12=var10000[(Integer)x[7]].getMethodName();
markOneStatement("int var1=var13.append(var12).toString().hashCode();\n", false, false, 13161);
int var1=var13.append(var12).toString().hashCode();
markOneStatement("int[] var2=(int[])((int[])x[6]);\n", false, false, 13221);
int[] var2=(int[])((int[])x[6]);
markOneStatement("int var3=var1 ^ var2[0];\n", false, false, 13262);
int var3=var1 ^ var2[0];
markOneStatement("int var4=var1 ^ var2[1];\n", false, false, 13295);
int var4=var1 ^ var2[1];
markOneStatement("int var5=var1 ^ var2[2];\n", false, false, 13328);
int var5=var1 ^ var2[2];
markOneStatement("int var27=var1 ^ var2[3];\n", false, false, 13361);
int var27=var1 ^ var2[3];
markOneStatement("int[] var26=(int[])((int[])x[5]);\n", false, false, 13395);
int[] var26=(int[])((int[])x[5]);
markOneStatement("int[] var6=(int[])((int[])x[1]);\n", false, false, 13437);
int[] var6=(int[])((int[])x[1]);
markOneStatement("int[] var7=(int[])((int[])x[2]);\n", false, false, 13478);
int[] var7=(int[])((int[])x[2]);
markOneStatement("int[] var8=(int[])((int[])x[3]);\n", false, false, 13519);
int[] var8=(int[])((int[])x[3]);
markOneStatement("int[] var9=(int[])((int[])x[4]);\n", false, false, 13560);
int[] var9=(int[])((int[])x[4]);
markOneStatement("byte[] var10=(byte[])((byte[])x[0]);\n", false, false, 13601);
byte[] var10=(byte[])((byte[])x[0]);
markOneStatement("char[] var25=((String)var0).toCharArray();\n", false, false, 13646);
char[] var25=((String)var0).toCharArray();
markOneStatement("int var31=0;\n", false, false, 13697);
int var31=0;
markOneStatement("var10000=null;\n", false, false, 13718);
var10000=null;
markOneStatement("label69: while (var31 == 0) {\n  ++var31;\n  int var11=var25.length;\n  int var28=0;\n  while (var28 < var11) {\n    if (var28 % 8 == 0) {\n      boolean var29=false;\n      var29=false;\n      var29=false;\n      var29=false;\n      int var14=var3 ^ var26[0];\n      int var15=var4 ^ var26[1];\n      int var16=var5 ^ var26[2];\n      int var17=var27 ^ var26[3];\n      int var18;\n      int var19;\n      int var20;\n      int var30;\n      for (var30=4; var30 < 36; var30+=4) {\n        var18=var6[var14 & 255] ^ var7[var15 >> 8 & 255] ^ var8[var16 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];\n        var19=var6[var15 & 255] ^ var7[var16 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var14 >>> 24]^ var26[var30 + 1];\n        var20=var6[var16 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var14 >> 16 & 255]^ var9[var15 >>> 24]^ var26[var30 + 2];\n        var17=var6[var17 & 255] ^ var7[var14 >> 8 & 255] ^ var8[var15 >> 16 & 255]^ var9[var16 >>> 24]^ var26[var30 + 3];\n        var30+=4;\n        var14=var6[var18 & 255] ^ var7[var19 >> 8 & 255] ^ var8[var20 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];\n        var15=var6[var19 & 255] ^ var7[var20 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var18 >>> 24]^ var26[var30 + 1];\n        var16=var6[var20 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var18 >> 16 & 255]^ var9[var19 >>> 24]^ var26[var30 + 2];\n        var17=var6[var17 & 255] ^ var7[var18 >> 8 & 255] ^ var8[var19 >> 16 & 255]^ var9[var20 >>> 24]^ var26[var30 + 3];\n      }\n      var20=var6[var14 & 255] ^ var7[var15 >> 8 & 255] ^ var8[var16 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];\n      var19=var6[var15 & 255] ^ var7[var16 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var14 >>> 24]^ var26[var30 + 1];\n      var18=var6[var16 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var14 >> 16 & 255]^ var9[var15 >>> 24]^ var26[var30 + 2];\n      var17=var6[var17 & 255] ^ var7[var14 >> 8 & 255] ^ var8[var15 >> 16 & 255]^ var9[var16 >>> 24]^ var26[var30 + 3];\n      var16=var30 + 4;\n      var3=var10[var20 & 255] & 255 ^ (var10[var19 >> 8 & 255] & 255) << 8 ^ (var10[var18 >> 16 & 255] & 255) << 16 ^ var10[var17 >>> 24] << 24 ^ var26[var16 + 0];\n      var4=var10[var19 & 255] & 255 ^ (var10[var18 >> 8 & 255] & 255) << 8 ^ (var10[var17 >> 16 & 255] & 255) << 16 ^ var10[var20 >>> 24] << 24 ^ var26[var16 + 1];\n      var5=var10[var18 & 255] & 255 ^ (var10[var17 >> 8 & 255] & 255) << 8 ^ (var10[var20 >> 16 & 255] & 255) << 16 ^ var10[var19 >>> 24] << 24 ^ var26[var16 + 2];\n      var27=var10[var17 & 255] & 255 ^ (var10[var20 >> 8 & 255] & 255) << 8 ^ (var10[var19 >> 16 & 255] & 255) << 16 ^ var10[var18 >>> 24] << 24 ^ var26[var16 + 3];\n    }\n    var21=false;\n    var10000=null;\n    try {\n      label63:       while (true) {\n        try {\n          if (!var21) {\n            var21=true;\nswitch (var28 % 8) {\ncase 0:\n              var25[var28]=(char)(var3 >> 16 ^ var25[var28]);\n            break label63;\ncase 1:\n          var25[var28]=(char)(var3 ^ var25[var28]);\n        break label63;\ncase 2:\n      var25[var28]=(char)(var4 >> 16 ^ var25[var28]);\n    break label63;\ncase 3:\n  var25[var28]=(char)(var4 ^ var25[var28]);\nbreak label63;\ncase 4:\nvar25[var28]=(char)(var5 >> 16 ^ var25[var28]);\nbreak label63;\ncase 5:\nvar25[var28]=(char)(var5 ^ var25[var28]);\nbreak label63;\ncase 6:\nvar25[var28]=(char)(var27 >> 16 ^ var25[var28]);\nbreak label63;\ncase 7:\nvar25[var28]=(char)(var27 ^ var25[var28]);\n}\n}\nbreak;\n}\n catch (Exception var23) {\n}\n}\n++var28;\n}\n catch (Exception var24) {\ncontinue label69;\n}\n}\nreturn new String(var25);\n}\n", false, false, 13742);
label69: while (var31 == 0) {
  ++var31;
  int var11=var25.length;
  int var28=0;
  while (var28 < var11) {
    if (var28 % 8 == 0) {
      boolean var29=false;
      var29=false;
      var29=false;
      var29=false;
      int var14=var3 ^ var26[0];
      int var15=var4 ^ var26[1];
      int var16=var5 ^ var26[2];
      int var17=var27 ^ var26[3];
      int var18;
      int var19;
      int var20;
      int var30;
      for (var30=4; var30 < 36; var30+=4) {
        var18=var6[var14 & 255] ^ var7[var15 >> 8 & 255] ^ var8[var16 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];
        var19=var6[var15 & 255] ^ var7[var16 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var14 >>> 24]^ var26[var30 + 1];
        var20=var6[var16 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var14 >> 16 & 255]^ var9[var15 >>> 24]^ var26[var30 + 2];
        var17=var6[var17 & 255] ^ var7[var14 >> 8 & 255] ^ var8[var15 >> 16 & 255]^ var9[var16 >>> 24]^ var26[var30 + 3];
        var30+=4;
        var14=var6[var18 & 255] ^ var7[var19 >> 8 & 255] ^ var8[var20 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];
        var15=var6[var19 & 255] ^ var7[var20 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var18 >>> 24]^ var26[var30 + 1];
        var16=var6[var20 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var18 >> 16 & 255]^ var9[var19 >>> 24]^ var26[var30 + 2];
        var17=var6[var17 & 255] ^ var7[var18 >> 8 & 255] ^ var8[var19 >> 16 & 255]^ var9[var20 >>> 24]^ var26[var30 + 3];
      }
      var20=var6[var14 & 255] ^ var7[var15 >> 8 & 255] ^ var8[var16 >> 16 & 255]^ var9[var17 >>> 24]^ var26[var30];
      var19=var6[var15 & 255] ^ var7[var16 >> 8 & 255] ^ var8[var17 >> 16 & 255]^ var9[var14 >>> 24]^ var26[var30 + 1];
      var18=var6[var16 & 255] ^ var7[var17 >> 8 & 255] ^ var8[var14 >> 16 & 255]^ var9[var15 >>> 24]^ var26[var30 + 2];
      var17=var6[var17 & 255] ^ var7[var14 >> 8 & 255] ^ var8[var15 >> 16 & 255]^ var9[var16 >>> 24]^ var26[var30 + 3];
      var16=var30 + 4;
      var3=var10[var20 & 255] & 255 ^ (var10[var19 >> 8 & 255] & 255) << 8 ^ (var10[var18 >> 16 & 255] & 255) << 16 ^ var10[var17 >>> 24] << 24 ^ var26[var16 + 0];
      var4=var10[var19 & 255] & 255 ^ (var10[var18 >> 8 & 255] & 255) << 8 ^ (var10[var17 >> 16 & 255] & 255) << 16 ^ var10[var20 >>> 24] << 24 ^ var26[var16 + 1];
      var5=var10[var18 & 255] & 255 ^ (var10[var17 >> 8 & 255] & 255) << 8 ^ (var10[var20 >> 16 & 255] & 255) << 16 ^ var10[var19 >>> 24] << 24 ^ var26[var16 + 2];
      var27=var10[var17 & 255] & 255 ^ (var10[var20 >> 8 & 255] & 255) << 8 ^ (var10[var19 >> 16 & 255] & 255) << 16 ^ var10[var18 >>> 24] << 24 ^ var26[var16 + 3];
    }
    var21=false;
    var10000=null;
    try {
      label63:       while (true) {
        try {
          if (!var21) {
            var21=true;
switch (var28 % 8) {
case 0:
              var25[var28]=(char)(var3 >> 16 ^ var25[var28]);
            break label63;
case 1:
          var25[var28]=(char)(var3 ^ var25[var28]);
        break label63;
case 2:
      var25[var28]=(char)(var4 >> 16 ^ var25[var28]);
    break label63;
case 3:
  var25[var28]=(char)(var4 ^ var25[var28]);
break label63;
case 4:
var25[var28]=(char)(var5 >> 16 ^ var25[var28]);
break label63;
case 5:
var25[var28]=(char)(var5 ^ var25[var28]);
break label63;
case 6:
var25[var28]=(char)(var27 >> 16 ^ var25[var28]);
break label63;
case 7:
var25[var28]=(char)(var27 ^ var25[var28]);
}
}
break;
}
 catch (Exception var23) {
}
}
++var28;
}
 catch (Exception var24) {
continue label69;
}
}
return new String(var25);
}
markOneStatement("return new String(var25);\n", false, false, 18540);
return new String(var25);
}

}
public static final int ooTotalStatement = 486;
}
