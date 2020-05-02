#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll get2(ll x){
    ll y=x/4*4;
    ll R=0;
    for (ll i=y;i<=x;i++) R^=i;
    return R;
}

ll get(ll x){
    if (x==0) return 0;
    ll k=(x+1)/2;
    x%=2;
    if (!x){
        return get2(k)*2ll;
    } else {
        return ((get2(k-1)*2ll)^(k&1ll));
    }
}

void sol(){
    ll l,r;
    scanf("%lld%lld",&l,&r);
    printf("%lld\n",(get(r)^get(l-1)));
}

int main() {
    int test;
    scanf("%d",&test);
    while (test--) sol();
    return 0;
}
