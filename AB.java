package gyg;
public class AB {  
        public static String encryptAndUncrypt
    (String secret) {               
     
            byte[] bt = { 0x24 ,0x09,0x58, 0x30, 0x0D,0x68,0x79, 0x40,0x16, 0x1B, 0x7E, 0x5E, 0x32, 0x45,0x20,0x2A,  
            		 0x66,0x32, 0x03,0x47,0x5F ,0x00 ,0x2E, 0x17,  0x14, 0x19, 0x23, 0x54, 0x18, 0x35, 0x4B, 0x1D };//result
            byte[] se=secret.getBytes();
    
            for (int i = 0; i < bt.length; i++) {  
                bt[i] = (byte) (bt[i] ^ (byte) 
    se[i]^(byte)(1));          // 通过异或运算进行解密  
            }  
            return new String(bt, 0, bt.length); 
 
        }  
        public static void main(String[] args) {  
                
     
            String secret="Cd8Vw0H4HyK1l1OOTAq2joKIwqLakMka";     //key              
   
           
           
            String encryptResult = AB.
    encryptAndUncrypt(secret);  
            System.out.println("解密后的值：" + 
    encryptResult);  
           
            
        }  
    } 
