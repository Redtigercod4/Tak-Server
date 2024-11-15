"use strict";(self.webpackChunkdocusaurus_static=self.webpackChunkdocusaurus_static||[]).push([[9740],{734:(e,n,r)=>{r.r(n),r.d(n,{assets:()=>d,contentTitle:()=>l,default:()=>h,frontMatter:()=>a,metadata:()=>t,toc:()=>o});var s=r(5893),i=r(1151);const a={},l="Overview and Installer Files",t={id:"installation/overview",title:"Overview and Installer Files",description:"TAK Server supports multiple deployment configurations:",source:"@site/docs/installation/overview.md",sourceDirName:"installation",slug:"/installation/overview",permalink:"/docs/installation/overview",draft:!1,unlisted:!1,editUrl:"https://gitlab.com/octospacc/editocttrialTools/-/blob/main/docusaurus-static/docs/installation/overview.md",tags:[],version:"current",frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"AWS / GovCloud Recommended Instance Type",permalink:"/docs/system-requirements/awsrequirements"},next:{title:"Prerequisites",permalink:"/docs/installation/oneserver/prerequisite"}},d={},o=[{value:"Installer for single-server install",id:"installer-for-single-server-install",level:2},{value:"Database installer for two-server install",id:"database-installer-for-two-server-install",level:2},{value:"Core installer for two-server install",id:"core-installer-for-two-server-install",level:2},{value:"Containerized docker install bundle",id:"containerized-docker-install-bundle",level:2},{value:"Containerized hardeneded docker install bundle",id:"containerized-hardeneded-docker-install-bundle",level:2},{value:"Installer for federation hub (beta)",id:"installer-for-federation-hub-beta",level:2},{value:"Verifying GPG signatures",id:"verifying-gpg-signatures",level:2},{value:"Verifying GPG Signatures on RPM Packages",id:"verifying-gpg-signatures-on-rpm-packages",level:3},{value:"Verifying GPG signatures on DEB packages",id:"verifying-gpg-signatures-on-deb-packages",level:3}];function c(e){const n={a:"a",code:"code",em:"em",h1:"h1",h2:"h2",h3:"h3",li:"li",p:"p",pre:"pre",strong:"strong",ul:"ul",...(0,i.a)(),...e.components};return(0,s.jsxs)(s.Fragment,{children:[(0,s.jsx)(n.h1,{id:"overview-and-installer-files",children:"Overview and Installer Files"}),"\n",(0,s.jsx)(n.p,{children:"TAK Server supports multiple deployment configurations:"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Single server install:"})," One server running TAK Server core (messaging, API, plugins and database): recommended for fewer than 500 users."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Two server install:"})," One server running TAK Server core (messaging, API, plugins and database) and a second server running PostgreSQL database: recommended for more than 500 users."]}),"\n",(0,s.jsxs)(n.li,{children:[(0,s.jsx)(n.strong,{children:"Containerized docker install:"})," One container running TAK Server core (messaging, API, plugins and database) and another container running PostgreSQL database (designed for operating systems other than CentOS 7 / RHEL 7). Hardened containers are published to both tak.gov and IronBank (see ",(0,s.jsx)(n.a,{href:"https://ironbank.dso.mil/repomap?searchText=tak%20server",children:"https://ironbank.dso.mil/repomap?searchText=tak%20server"}),")."]}),"\n"]}),"\n",(0,s.jsx)(n.p,{children:"The following installation files are provided:"}),"\n",(0,s.jsx)(n.h2,{id:"installer-for-single-server-install",children:"Installer for single-server install"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["RHEL/Rocky/CentOS: ",(0,s.jsx)(n.code,{children:"takserver-5.2-RELEASE-x.noarch.rpm"})]}),"\n",(0,s.jsxs)(n.li,{children:["Ubuntu/RaspPi: ",(0,s.jsx)(n.code,{children:"takserver_5.2-RELEASE-x_all.deb"})]}),"\n"]}),"\n",(0,s.jsx)(n.h2,{id:"database-installer-for-two-server-install",children:"Database installer for two-server install"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["RHEL/Rocky/CentOS: ",(0,s.jsx)(n.code,{children:"takserver-database-5.2-RELEASE-x.noarch.rpm"})]}),"\n",(0,s.jsxs)(n.li,{children:["Ubuntu/RaspPi: ",(0,s.jsx)(n.code,{children:"takserver-database_5.2-RELEASE-x_all.deb"})]}),"\n"]}),"\n",(0,s.jsx)(n.h2,{id:"core-installer-for-two-server-install",children:"Core installer for two-server install"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["RHEL/Rocky/CentOS: ",(0,s.jsx)(n.code,{children:"takserver-core-5.2-RELEASE-x.noarch.rpm"})]}),"\n",(0,s.jsxs)(n.li,{children:["Ubuntu/RaspPi: ",(0,s.jsx)(n.code,{children:"takserver-core_5.2-RELEASE-x_all.deb"})]}),"\n"]}),"\n",(0,s.jsx)(n.h2,{id:"containerized-docker-install-bundle",children:"Containerized docker install bundle"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"takserver-docker-5.2-RELEASE-x.zip"})}),"\n"]}),"\n",(0,s.jsx)(n.h2,{id:"containerized-hardeneded-docker-install-bundle",children:"Containerized hardeneded docker install bundle"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsx)(n.li,{children:(0,s.jsx)(n.code,{children:"takserver-docker-hardened-5.2-RELEASE-x.zip"})}),"\n"]}),"\n",(0,s.jsx)(n.h2,{id:"installer-for-federation-hub-beta",children:"Installer for federation hub (beta)"}),"\n",(0,s.jsxs)(n.ul,{children:["\n",(0,s.jsxs)(n.li,{children:["RHEL/Rocky/CentOS: ",(0,s.jsx)(n.code,{children:"takserver-fed-hub-5.2-RELEASE-x.noarch.rpm"})]}),"\n",(0,s.jsxs)(n.li,{children:["Ubuntu/RaspPi: ",(0,s.jsx)(n.code,{children:"takserver-fed-hub_5.2-RELEASE-x_all.deb"})]}),"\n"]}),"\n",(0,s.jsxs)(n.p,{children:["Federation hub documentation available here:\n",(0,s.jsx)(n.a,{href:"https://wiki.tak.gov/display/TPC/Federation+Hub",children:"https://wiki.tak.gov/display/TPC/Federation+Hub"})]}),"\n",(0,s.jsx)(n.h2,{id:"verifying-gpg-signatures",children:"Verifying GPG signatures"}),"\n",(0,s.jsx)(n.h3,{id:"verifying-gpg-signatures-on-rpm-packages",children:"Verifying GPG Signatures on RPM Packages"}),"\n",(0,s.jsxs)(n.p,{children:["The GPG public key for TAK Server can be found under\n",(0,s.jsx)(n.a,{href:"https://artifacts.tak.gov/ui/repos/tree/General/TAKServer/release/",children:"https://artifacts.tak.gov/ui/repos/tree/General/TAKServer/release/"})]}),"\n",(0,s.jsxs)(n.p,{children:["Select the TAK Server release version and download the file ",(0,s.jsx)(n.em,{children:"takserver-public-gpg.key"})]}),"\n",(0,s.jsx)(n.p,{children:"Import the key to the RPM key management:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"sudo rpm --import takserver-public-gpg.key\n"})}),"\n",(0,s.jsx)(n.p,{children:"Verifying signature for the rpm installer package:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"rpm --checksig takserver-5.2-RELEASE<version>.noarch.rpm\n"})}),"\n",(0,s.jsx)(n.p,{children:"Example of a successful output:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"takserver-5.2-RELEASE28.noarch.rpm: rsa sha1 (md5) pgp md5 OK\n"})}),"\n",(0,s.jsx)(n.p,{children:"Example of a failed output:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"takserver-5.2-RELEASE28.noarch.rpm: RSA sha1 ((MD5) PGP) md5 NOT OK\n(MISSING KEYS: (MD5) PGP#6851f5b5)\n"})}),"\n",(0,s.jsx)(n.p,{children:"If the RPM packages were not signed with a GPG key, the output might look like:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"takserver-5.2-RELEASE25.noarch.rpm: sha1 md5 OK\n"})}),"\n",(0,s.jsx)(n.h3,{id:"verifying-gpg-signatures-on-deb-packages",children:"Verifying GPG signatures on DEB packages"}),"\n",(0,s.jsxs)(n.p,{children:["Select the appropriate TAK Server release version and download the file ",(0,s.jsx)(n.em,{children:"takserver-public-gpg.key"})," and ",(0,s.jsx)(n.em,{children:"deb_policy.pol"})]}),"\n",(0,s.jsx)(n.p,{children:"Install the debsig-verify utility:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"sudo apt install debsig-verify\n"})}),"\n",(0,s.jsx)(n.p,{children:"Using the ID within the deb_policy.pol file, ex. 039FCDA2D8907527, run the following command to verify signed TAK Server deb resources:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"sudo mkdir /usr/share/debsig/keyrings/039FCDA2D8907527\nsudo mkdir /etc/debsig/policies/039FCDA2D8907527\nsudo touch /usr/share/debsig/keyrings/039FCDA2D8907527/debsig.gpg\nsudo gpg --no-default-keyring --keyring /usr/share/debsig/keyrings/039FCDA2D8907527/debsig.gpg --import takserver-public-gpg.key\nsudo cp deb_policy.pol /etc/debsig/policies/039FCDA2D8907527/debsig.pol\ndebsig-verify -v takserver-5.2-RELEASE_all.deb\n"})}),"\n",(0,s.jsx)(n.p,{children:"Confirm signature verification by identifying statement:"}),"\n",(0,s.jsx)(n.pre,{children:(0,s.jsx)(n.code,{className:"language-bash",children:"debsig: Verified package from 'TAK Product Center' (TAK Server Release)\n"})})]})}function h(e={}){const{wrapper:n}={...(0,i.a)(),...e.components};return n?(0,s.jsx)(n,{...e,children:(0,s.jsx)(c,{...e})}):c(e)}},1151:(e,n,r)=>{r.d(n,{Z:()=>t,a:()=>l});var s=r(7294);const i={},a=s.createContext(i);function l(e){const n=s.useContext(a);return s.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function t(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(i):e.components||i:l(e.components),s.createElement(a.Provider,{value:n},e.children)}}}]);