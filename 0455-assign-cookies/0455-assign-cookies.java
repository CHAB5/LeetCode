import java.lang.Math;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        int len = Math.max(s.length, g.length);
        
        int temp=0;
        
        for(int i=0; i < s.length; i++){  
                 for(int j=1; j < (s.length-i); j++){  
                          if(s[j-1] > s[j]){  
                                 //swap elements  
                                 temp = s[j-1];  
                                 s[j-1] = s[j];  
                                 s[j] = temp;  
                         }  
                          
                 }  
         }  
        
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        
        temp=0;
        for(int i=0; i < g.length; i++){  
                 for(int j=1; j < (g.length-i); j++){  
                          if(g[j-1] > g[j]){  
                                 //swap elements  
                                 temp = g[j-1];  
                                 g[j-1] = g[j];  
                                 g[j] = temp;  
                         }  
                          
                 }  
         }  
        
        // for(int i=0;i<s.length-1;i++){
        //     temp = 0;
        //     for(int j=0;j<s.length;j++){
        //         if(s[j]<s[i]) {
        //             temp = s[i];
        //             s[i] = s[j];
        //             s[j] = temp;
        //         }
        //     }
        // }
        
        
//         for(int i=0;i<g.length-1;i++){
//             temp = 0;
//             for(int j=0;j<g.length;j++){
//                 if(g[j]<g[i]) {
//                     temp = g[i];
//                     g[i] = g[j];
//                     g[j] = temp;
//                 }
//             }
//         }

        for(int i=0;i<g.length;i++){
            System.out.println(g[i]);
        }
        
        System.out.println("Before Starting: res: "+ res);
        int child = 0;
        for(int j=0; j<s.length; j++)
        {
            System.out.println("Inside: j: "+ j);
            System.out.println("s[j]: "+ s[j]);
            System.out.println("g[j]: "+ g[child]);

            if(s[j]>=g[child]){
                res++;
                System.out.println("During: res: "+ res);
                if(child<g.length-1){
                    child++;
                }
                else{
                    return res;
                }
            }
        }
        
        System.out.println("After Done: res: "+ res);
        return res;
    }
}