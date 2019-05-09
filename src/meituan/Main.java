package meituan;

/**
 * Created by Fang on 2019/4/23 20:27
 */
public class Main {
    public static void main(String[] args) {

    }

}
//const int N=1e5+100;
//        const int MOD=1e9+7;
//        struct Edge{
//        int to,next;
//        }e[N*2];
//        int a[N],ans[N],tot,head[N],size[N];
//        long long dp[N][2];
//
//        void init(){
//        tot=0;
//        memset(head,-1,sizeof(head));
//        }
//
//        void addedge(int from,int to){
//        e[tot]=(Edge){to,head[from]};
//        head[from]=tot++;
//        }
//
//        void dfs(int u){
//        if(size[u]) dp[u][1]=1;
//        dp[u][0]=dp[u][1]^1;
//        for(int i=head[u];i!=-1;i=e[i].next){
//        int v=e[i].to;
//        dfs(v);
//        long long t1=dp[u][0]*dp[v][1]+dp[u][0]*dp[v][0];
//        long long t2=dp[u][0]*dp[v][1]+dp[u][1]*dp[v][0]+dp[u][1]*dp[v][1];
//        dp[u][0]=t1%MOD,dp[u][1]=t2%MOD;
//        }
//        }
//
//        int main(){
//        int n,fa;
//        scanf("%d",&n);
//        init();
//        for(int i=1;i<n;i++){
//        scanf("%d",&fa);
//        addedge(fa,i);
//        }
//        for(int i=0;i<n;i++)   scanf("%d",&size[i]);
//        dfs(0);
//        printf("%lld\n",dp[0][1]);
//        return 0;
//        }
//        ---------------------
//        作者：_zidaoziyan
//        来源：CSDN
//        原文：https://blog.csdn.net/acm_fighting/article/details/53021137
//        版权声明：本文为博主原创文章，转载请附上博文链接！