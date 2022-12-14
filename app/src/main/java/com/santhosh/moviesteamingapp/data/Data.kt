package com.santhosh.moviesteamingapp.data

import com.santhosh.moviesteamingapp.model.CastPageModel
import com.santhosh.moviesteamingapp.model.HomeModelClass
import com.santhosh.moviesteamingapp.model.TrailerPageModel

class Data {
    var avengerCastList = ArrayList<CastPageModel>()
    var rrrCastList = ArrayList<CastPageModel>()
    var strangeCastList = ArrayList<CastPageModel>()
    var sherlockCastList = ArrayList<CastPageModel>()
    var spideyCastList = ArrayList<CastPageModel>()
    var kgf2CastList = ArrayList<CastPageModel>()
    var brahmastraCastList = ArrayList<CastPageModel>()
    var vikramCastList = ArrayList<CastPageModel>()
    var description = HashMap<String,String>()
    var listItems = ArrayList<HomeModelClass>()

    var avengerTrailerList = ArrayList<TrailerPageModel>()
    var rrrTrailerList = ArrayList<TrailerPageModel>()
    var strangeTrailerList = ArrayList<TrailerPageModel>()
    var sherlockTrailerList = ArrayList<TrailerPageModel>()
    var spideyTrailerList = ArrayList<TrailerPageModel>()
    var kgf2TrailerList = ArrayList<TrailerPageModel>()
    var brahmastraTrailerList = ArrayList<TrailerPageModel>()
    var vikramTrailerList = ArrayList<TrailerPageModel>()

    fun avengersCastList():ArrayList<CastPageModel>{
        avengerCastList.add(CastPageModel("https://media1.popsugar-assets.com/files/thumbor/msjEO8oq7PWud7pFv_Cm6GR6E-U/0x1:2771x2772/fit-in/500x500/filters:format_auto-!!-:strip_icc-!!-/2020/03/30/878/n/1922398/eb11f12e5e825104ca01c1.02079643_/i/Robert-Downey-Jr.jpg","Robert Downey Jr.","Iron Man"))
        avengerCastList.add(CastPageModel("https://flxt.tmsimg.com/assets/74371_v9_bc.jpg","Josh Brolin","Thanos"))
        avengerCastList.add(CastPageModel("https://cdn.britannica.com/92/215392-050-96A4BC1D/Australian-actor-Chris-Hemsworth-2019.jpg","Chris Hemsworth","Thor"))
        avengerCastList.add(CastPageModel("https://cdn.britannica.com/28/215028-050-94E9EA1E/American-actor-Chris-Evans-2019.jpg","Chris Evans","Captain America"))
        avengerCastList.add(CastPageModel("https://theskincareedit.com/.image/c_fit%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_620/MTg1ODIyODY0OTQxNzg2NTE2/scarlett-johansson-american-cinematheque-awards-2021.jpg","Scarlett Johansson","Natasha Romanoff"))
        avengerCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Tom_Holland_by_Gage_Skidmore.jpg/1200px-Tom_Holland_by_Gage_Skidmore.jpg","Tom Holland","Spider-Man"))
        avengerCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Mark_Ruffalo_%2836201774756%29_%28cropped%29.jpg/1200px-Mark_Ruffalo_%2836201774756%29_%28cropped%29.jpg","Mark Ruffalo","Hulk"))
        return avengerCastList
    }

    fun rrrCastsList():ArrayList<CastPageModel>{
        rrrCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/e/ea/Ram_Charan_at_Promotion_of_%27Zanjeer%27_on_Jhalak_Dikhhla_Jaa.jpg","Ram Charan","Alluri Sitarama Raju"))
        rrrCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/e/e7/N.T.Rama_Rao_Jr._at_the_RRR_Press_Meet_in_Chennai.jpg","N. T. Rama Rao Jr.","Komaram Bheem"))
        rrrCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/0/04/Ajay_Devgn.jpg","Ajay Devgn","Venkata Rama Raju"))
        rrrCastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/RBnTJPegPFLBS4VPsNLbf6iAoD.jpg","Alia Bhatt","Sita"))
        rrrCastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/iAzUTXzFWwEkRx6Ygudqnx4DmtW.jpg","Olivia Morris","Jennifer"))
        rrrCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BYzE0YmE5OTUtYjFmOS00OGY4LWE0NmQtMWY4MjA3OWM4MTMwXkEyXkFqcGdeQXVyMTI2Nzk3NzI4._V1_.jpg","Ray Stevenson","Governor Scott Buxton"))
        rrrCastList.add(CastPageModel("https://biooverview.com/wp-content/uploads/2021/06/Shriya-4.jpg","Shriya Saran","Sarojini"))
        return rrrCastList
    }

    fun strangeCastsList():ArrayList<CastPageModel>{
        strangeCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BMjE0MDkzMDQwOF5BMl5BanBnXkFtZTgwOTE1Mjg1MzE@._V1_.jpg","Benedict Cumberbatch","Doctor Strange"))
        strangeCastList.add(CastPageModel("https://images.mubicdn.net/images/cast_member/58895/cache-574742-1652166339/image-w856.jpg","Benedict Wong","Wong"))
        strangeCastList.add(CastPageModel("https://flxt.tmsimg.com/assets/273505_v9_bc.jpg","Rachel McAdams","Christine Palmer"))
        strangeCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BNzA5MDEyMTY3Nl5BMl5BanBnXkFtZTgwODQ0MjcxMDE@._V1_.jpg","Chiwetel Ejiofor","Baron Mordo"))
        strangeCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Tilda_Swinton_Viennale_2018.jpg/800px-Tilda_Swinton_Viennale_2018.jpg","Tilda Swinton","Ancient One"))
        strangeCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/f/f2/Mads_Mikkelsen_Cannes_2013_2.jpg","Mads Mikkelsen","Kaecilius"))
        strangeCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/e/e6/Michael_Stuhlbarg_in_2018_%283%29.jpg","Michael Stuhlbarg","Nicodemus West"))
        return strangeCastList
    }

    fun sherlockCastsList():ArrayList<CastPageModel>{
        sherlockCastList.add(CastPageModel("https://media1.popsugar-assets.com/files/thumbor/msjEO8oq7PWud7pFv_Cm6GR6E-U/0x1:2771x2772/fit-in/500x500/filters:format_auto-!!-:strip_icc-!!-/2020/03/30/878/n/1922398/eb11f12e5e825104ca01c1.02079643_/i/Robert-Downey-Jr.jpg","Robert Downey Jr.","Sherlock Holmes"))
        sherlockCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BMTMwOTg5NTQ3NV5BMl5BanBnXkFtZTcwNzM3MDAzNQ@@._V1_.jpg","Jude Law","John H. Watson"))
        sherlockCastList.add(CastPageModel("https://flxt.tmsimg.com/assets/273505_v9_bc.jpg","Rachel McAdams","Irene Adler"))
        sherlockCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/c/cd/Mark_Strong_by_Gage_Skidmore.jpg","Mark Strong","Lord Henry Blackwood"))
        sherlockCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/e/e1/Kelly_Reilly_2013.jpg","Kelly Reilly","Mary Morstan"))
        sherlockCastList.add(CastPageModel("https://superstarsbio.com/wp-content/uploads/2021/02/Robert-Maillet-age.jpg","Robert Maillet","Dredger"))
        sherlockCastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/9atfOgIxhfOKvv2be8HEp6SzOct.jpg","Eddie Marsan","Inspector Lestrade"))
        return sherlockCastList
    }

    fun spideyCastsList():ArrayList<CastPageModel>{
        spideyCastList.add(CastPageModel("https://static.wikia.nocookie.net/international-dubbing/images/3/38/Tom_Holland.jpeg/revision/latest?cb=20210626174602","Tom Holland","Spider-Man, Peter Parker"))
        spideyCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Zendaya_-_2019_by_Glenn_Francis.jpg/800px-Zendaya_-_2019_by_Glenn_Francis.jpg","Zendaya","Michelle \"MJ\" Jones"))
        spideyCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/c/c2/Tobey_Maguire_2014.jpg","Tobey Maguire","Spider-Man, Peter Parker"))
        spideyCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/b/bf/Andrew_Garfield_by_Gage_Skidmore_%28cropped%29.jpg","Andrew Garfield","Spider-Man, Peter Parker"))
        spideyCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Marisa_Tomei_%2882155%29_%28cropped%29.jpg/640px-Marisa_Tomei_%2882155%29_%28cropped%29.jpg","Marisa Tomei","Aunt May"))
        spideyCastList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/1/14/Willem_Dafoe_Cannes_2019.jpg","Willem Dafoe","Norman Osborn"))
        spideyCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BMjE0MDkzMDQwOF5BMl5BanBnXkFtZTgwOTE1Mjg1MzE@._V1_.jpg","Benedict Cumberbatch","Doctor Strange"))
        return spideyCastList
    }

    fun kgf2CastsList():ArrayList<CastPageModel>{
        kgf2CastList.add(CastPageModel("https://starsbiog.com/wp-content/uploads/2020/05/yash-kgf-actor.jpg","Yash","Rocky Bhai"))
        kgf2CastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/pTsixKDFS3n2xsvR6wDZ9J6jjfQ.jpg","Srinidhi Shetty","Reena"))
        kgf2CastList.add(CastPageModel("https://variety.com/wp-content/uploads/2022/02/Sanjay-Dutt.jpg?w=1000","Sanjay Dutt","Adheera"))
        kgf2CastList.add(CastPageModel("https://i2.cinestaan.com/image-bank/1500-1500/139001-140000/139252.jpg","Raveena Tandon","Ramika Sen"))
        kgf2CastList.add(CastPageModel("https://celebsecrets.in/wp-content/uploads/2021/06/AJ-scaled.jpg","Archana Jois","Shanthamma"))
        kgf2CastList.add(CastPageModel("https://cdn.siasat.com/wp-content/uploads/2021/08/Prakash-Raj.jpg","Prakash Raj","Vijayendra Ingalgi"))
        kgf2CastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/jzO0wN21tEcmz0haekvliQU91JM.jpg","Rao Ramesh","Kanneganti Raghavan"))
        return kgf2CastList
    }

    fun brahmastraCastsList():ArrayList<CastPageModel>{
        brahmastraCastList.add(CastPageModel("https://images.hindustantimes.com/img/2022/09/08/1600x900/Ranbir_Kapoor_1662644808340_1662644808496_1662644808496.jpg","Ranbir Kapoor","Shiva"))
        brahmastraCastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/RBnTJPegPFLBS4VPsNLbf6iAoD.jpg","Alia Bhatt","Isha"))
        brahmastraCastList.add(CastPageModel("https://m.media-amazon.com/images/M/MV5BNTk1OTUxMzIzMV5BMl5BanBnXkFtZTcwMzMxMjI0Nw@@._V1_.jpg","Amitabh Bachchan","Guru Arvind"))
        brahmastraCastList.add(CastPageModel("https://static.toiimg.com/photo/msid-82822085/82822085.jpg?51305","Nagarjuna","Ajay Vashisht"))
        brahmastraCastList.add(CastPageModel("https://img.indiaforums.com/person/480x360/0/0468-mouni-roy.jpg?c=4jV853","Mouni Roy","Damyanti"))
        brahmastraCastList.add(CastPageModel("https://www.ringsidenews.com/wp-content/uploads/2021/05/Saurav-Gurjar.jpg","Saurav Gurjar","Bhavesh Singh"))
        brahmastraCastList.add(CastPageModel("https://static.toiimg.com/photo/msid-88877253/88877253.jpg?20662","Divyenndu","Kartikeya"))
        return brahmastraCastList
    }

    fun vikramCastsList():ArrayList<CastPageModel>{
        vikramCastList.add(CastPageModel("https://img.onmanorama.com/content/dam/mm/en/entertainment/interviews/images/2022/6/5/kamal-haasan-c.jpg","Kamal Haasan","Arun Kumar Vikram"))
        vikramCastList.add(CastPageModel("https://www.newsintv.com/wp-content/uploads/2022/07/vijay-sethupathi-biography.jpg","Vijay Sethupathi","Sandhanam"))
        vikramCastList.add(CastPageModel("https://static.toiimg.com/photo/msid-91558651/91558651.jpg","Fahadh Faasil","Agent Amar"))
        vikramCastList.add(CastPageModel("https://www.themoviedb.org/t/p/w500/bJgZlSd5WCIi7kp3IZKS0FDjIL2.jpg","Gayathrie","Gayathri Amar"))
        vikramCastList.add(CastPageModel("https://www.gethucinema.com/wp-content/uploads/2022/07/MayaSundarakrishnan-213.jpg","Maya Sundarakrishnan","Escort"))
        vikramCastList.add(CastPageModel("https://staticimg.spicyonion.com/images/profile/artist/arjun-das.jpg","Arjun Das","Anbu"))
        vikramCastList.add(CastPageModel("https://superstarsbio.com/wp-content/uploads/2019/08/Kalidasan-Jayaram-ez.jpg","Kalidas Jayaram","ACP Prabhanjan"))
        return vikramCastList
    }

    fun descriptions():HashMap<String,String>{
        description.put("Avengers Infinity War","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.")
        description.put("RRR","During the British era Malli, a small tribal girl, is taken away by British governor Scott Buxton and his wife Catherine against the wishes of her parents. Rama Raju is an Indian cop who works for the British army; for him duty comes first, and he is very ruthless to revolutionary Indians but is never given his due by British government. The British government find that a tribal Komaram Bheem, who considers Malli his sister, has started his search for her and could be an obstacle for the British army. The governor and his wife announce a special post for any officer who can bring Bheem to them. Rama Raju decides to take the matters into his own hands and promises the government to bring him in dead or alive. Bheem by now has reached he city in search of Malli and pretends to be a mechanic, Afzal. During a train accident on a lake he and Rama Raju risk their lives and save a kid and become best of friends. But each man will clash with the other and will thirst for each other's blood in order to complete their missions.")
        description.put("Doctor Strange","Marvel's \"Doctor Strange\" follows the story of the talented neurosurgeon Doctor Stephen Strange who, after a tragic car accident, must put ego aside and learn the secrets of a hidden world of mysticism and alternate dimensions. Based in New York City's Greenwich Village, Doctor Strange must act as an intermediary between the real world and what lies beyond, utilising a vast array of metaphysical abilities and artifacts to protect the Marvel Cinematic Universe.")
        description.put("Sherlock Holmes","After finally catching serial killer and occult \"sorcerer\" Lord Blackwood, legendary sleuth Sherlock Holmes and his assistant Dr. Watson can close yet another successful case. But when Blackwood mysteriously returns from the grave and resumes his killing spree, Holmes must take up the hunt once again. Contending with his partner's new fianc??e and the dimwitted head of Scotland Yard, the dauntless detective must unravel the clues that will lead him into a twisted web of murder, deceit, and black magic - and the deadly embrace of temptress Irene Adler.")
        description.put("Spider-Man: No Way Home","With Spider-Man's identity now revealed, our friendly neighborhood web-slinger is unmasked and no longer able to separate his normal life as Peter Parker from the high stakes of being a superhero. When Peter asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.")
        description.put("K.G.F: Chapter 2","KGF 2 starts exactly where its prequel ends, however, there is a twist in the sequel, Anant Nag is replaced by Prakash Raj. Though both actors are incredible performers, the replacement, or at least the split second of confusion surely felt like faint discontinuation. Well, coming to the film, Rocky (Yash) takes over KGF (Kolar Gold Fields) and creates his humongous empire, but fate has other plans as Garuda's brother Adheera (Sanjay Dutt) comes into the scene, evidently with a bigger plan. The circumstances force Rocky to leave KGF, and how he manages to face the deadly Adheera, the then Prime Minister of India Ramika Sen (Raveena Tandon), and his girlfriend Reena (Srinidhi Shetty) amid the war-like state forms the crux of the story.")
        description.put("Brahm??stra: Part One ??? Shiva","In ancient India people of Brahmansh community would take care of their spiritual weapon Brahmastra but as years passed by with changing times people started to forget about it.In present day Shiva a DJ has strange connection with fire which never harms him he meets Isha and both fall in love.A Delhi based scientist Mohan Bhargav from Brahmansh community posses a piece of Brahmastra and gets attacked by two evil forces Zor and Raftaar but he manages to overcome them with powers of Vanarastra but the evil queen Junoon manages to control him and tortures to ask about Brahmastra.But Bhargav being protector of it gives his life which is seen by Shiva in hallucinations after he comes in contact with fire he also notices that next target could be an artist Anish Shetty.Shiva and Isha go to save Anish at Varanasi where he tells him the events he saw but Junoon has already reached there to kill him but Anish manages to escape with Shiva and Isha with power of Nandiastra and asks them to take him to Guruji's Ashram in Himachal.On the way Anish finds who actually is Shiva and gives his piece of Brahmastra to Isha an asks her to reach it safely to Guruji as Junoon is following them whose unaware of Guruji's Ashram.Anish looses his life while fighting with Junoon and her men while after lot of hurdles Shiva and Isha reach Guruji's Ashram where Guruji revels who actually Shiva is and his connection with fire.And that Brahmastra has three pieces of which one is missing and if Junoon joins them all together the universe will be destroyed.")
        description.put("Vikram","Karnan an alcoholic enjoys a freak life but he gets brutally killed by a gang of masked men.Amar a black squad commando and is team is given the case.Amar sees that two other person were killed brutally in similar passion by the masked gang and they were government officials but is surprised why Karnan was killed as he was not connected to any government agencies.Amar's inquiry leads him to find that Karnan became an alcoholic,drug addict and womanizer after death of his son but also had another side of cold shoulder towards his grandson whose suffering from heart ailment and he lived for him.While investigating the case Amar comes across Santhanam a drug lord who has huge contacts and operates without fear on the other hand the mask gang continues to eliminate government officials.Amar finds who could be their next target and along with his team goes to save him whose under protection of Sandhanam.But the mask gang over powers them, Amar manages to chase their leader leading to an unknown identity called Vikram.")
        return description
    }

    fun avengerTrailersList():ArrayList<TrailerPageModel>{
        avengerTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=QwievZ1Tx-8","https://i.ytimg.com/vi/QwievZ1Tx-8/maxresdefault.jpg","Marvel Studios' Avengers: Infinity War - Official Trailer"))
        avengerTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=6ZfuNTqbHE8","https://i.ytimg.com/vi/6ZfuNTqbHE8/maxresdefault.jpg","Marvel Studios' Avengers: Infinity War Official Trailer"))
        return avengerTrailerList
    }

    fun rrrTrailersList():ArrayList<TrailerPageModel>{
        rrrTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=BN1MwXUR3PM","https://i.ytimg.com/vi/BN1MwXUR3PM/maxresdefault.jpg","Ramaraju For Bheem - Bheem Intro - RRR (Telugu) | NTR, Ram Charan, Ajay Devgn, Alia | SS Rajamouli"))
        rrrTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=2_BkCz3OnlY","https://i.ytimg.com/vi/2_BkCz3OnlY/maxresdefault.jpg","Bheem For Ramaraju - Ramaraju Intro - RRR(Telugu) | NTR, Ram Charan, Ajay Devgn | SS Rajamouli"))
        rrrTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=NgBoMJy386M","https://i.ytimg.com/vi/NgBoMJy386M/maxresdefault.jpg","RRR Trailer (Telugu) - NTR, Ram Charan, Ajay Devgn, Alia Bhatt | SS Rajamouli | 25th March 2022"))
        return rrrTrailerList
    }

    fun strangeTrailersList():ArrayList<TrailerPageModel>{
        strangeTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=Lt-U_t2pUHI","https://i.ytimg.com/vi/Lt-U_t2pUHI/maxresdefault.jpg","Marvel's Doctor Strange Teaser Trailer"))
        strangeTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=HSzx-zryEgM","https://wallpaperaccess.com/full/621125.jpg","Doctor Strange Official Trailer 2"))
        return strangeTrailerList
    }

    fun sherlockTrailersList():ArrayList<TrailerPageModel>{
        sherlockTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=iKUzhzustok","https://i.ytimg.com/vi/iKUzhzustok/maxresdefault.jpg","Sherlock Holmes Trailer # 1"))
        return sherlockTrailerList
    }

    fun spideyTrailersList():ArrayList<TrailerPageModel>{
        spideyTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=rt-2cxAiPJk","https://i.ytimg.com/vi/rt-2cxAiPJk/maxresdefault.jpg","SPIDER-MAN: NO WAY HOME - Official Teaser Trailer (HD)"))
        spideyTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=JfVOs4VSpmA","https://i.ytimg.com/vi/JfVOs4VSpmA/maxresdefault.jpg","SPIDER-MAN: NO WAY HOME - Official Trailer (HD)"))
        return spideyTrailerList
    }

    fun kgf2TrailersList():ArrayList<TrailerPageModel>{
        kgf2TrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=Qah9sSIXJqk","https://i.ytimg.com/vi/Qah9sSIXJqk/mqdefault.jpg","KGF Chapter2 TEASER |Yash|Sanjay Dutt|Raveena Tandon|Srinidhi Shetty|Prashanth Neel|Vijay Kiragandur"))
        kgf2TrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=jQsE85cI384","https://i.ytimg.com/vi/jQsE85cI384/maxresdefault.jpg","KGF Chapter 2 Trailer | Kannada |Yash|Sanjay Dutt|Raveena|Srinidhi|Prashanth Neel|Vijay Kiragandur"))
        return kgf2TrailerList
    }

    fun brahmastraTrailersList():ArrayList<TrailerPageModel>{
        brahmastraTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=XcCWBRqWmyw","https://i.ytimg.com/vi/XcCWBRqWmyw/maxresdefault.jpg","BRAHM??STRA Part One: Shiva | Official Motion Poster | Ayan Mukerji"))
        brahmastraTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=V5jVntRVl-0","https://i.ytimg.com/vi/V5jVntRVl-0/maxresdefault.jpg","BRAHM??STRA OFFICIAL TRAILER 4K | Hindi | Amitabh | Ranbir | Alia | Ayan"))
        return brahmastraTrailerList
    }

    fun vikramTrailersList():ArrayList<TrailerPageModel>{
        vikramTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=NXSigiaZ0W0","https://cdn.telugu.yousay.tv/wp-content/uploads/sites/2/2022/06/04081141/vik-1.jpeg","VIKRAM - Official Title Teaser | #KamalHaasan232 | Kamal Haasan | Lokesh Kanagaraj | Anirudh"))
        vikramTrailerList.add(TrailerPageModel("https://www.youtube.com/watch?v=OKBMCL-frPU","https://i.ytimg.com/vi/OKBMCL-frPU/maxresdefault.jpg","VIKRAM - Official Trailer | Kamal Haasan | VijaySethupathi, FahadhFaasil | LokeshKanagaraj | Anirudh"))
        return vikramTrailerList
    }

    fun movieItems():ArrayList<HomeModelClass>{
        listItems.add(HomeModelClass("En/US","2h 29m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/mDfJG3LC3Dqb67AZ52x3Z0jU0uB.jpg","Avengers Infinity War","2018","Action/Sci-fi", descriptions().get("Avengers Infinity War").toString(),avengersCastList(),"https://cdn.arstechnica.net/wp-content/uploads/2018/03/InfinityWarAvengers-1.jpg","https://www.hollywoodreporter.com/wp-content/uploads/2017/07/dfhc4lvvwaamtxx_-_h_2017.jpg?w=1296",avengerTrailersList()))
        listItems.add(HomeModelClass("Te/IN","3h 2m","https://i.ytimg.com/vi/lDVQojLPI4Y/maxresdefault.jpg","RRR","2022","Action/Drama", descriptions().get("RRR").toString(),rrrCastsList(),"https://static1.colliderimages.com/wordpress/wp-content/uploads/2022/06/Ram-Charan-RRR-feature.jpg","https://static01.nyt.com/images/2022/04/05/arts/rrr4/merlin_205052391_46430411-aa97-45b4-b0a3-72ef8b593d40-videoSixteenByNine3000.jpg",rrrTrailersList()))
        listItems.add(HomeModelClass("En/US","1h 55m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/qUv51IFUvVRAP2379ThmA3eLJx6.jpg","Doctor Strange","2016","Action/Adventure", descriptions().get("Doctor Strange").toString(),strangeCastsList(),"https://static1.srcdn.com/wordpress/wp-content/uploads/2020/12/Doctor-strange-Avengers-Infinity-War-sorceror-supreme.jpg","https://static1.dualshockersimages.com/wordpress/wp-content/uploads/2022/05/Marvel-Stories-in-which-Doctor-Strange-was-villain.jpeg",strangeTrailersList()))
        listItems.add(HomeModelClass("En/US","2h 09m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/veXdzn7LL0bFIDGmE7tTkvRg0qV.jpg","Sherlock Holmes","2009","Crime", descriptions().get("Sherlock Holmes").toString(),sherlockCastsList(),"https://img.ilgcdn.com/sites/default/files/styles/xl/public/foto/2018/06/19/1529430934-sherlock-holmes.jpg?_=1529430934","https://media.timeout.com/images/50929/image.jpg",sherlockTrailersList()))
        listItems.add(HomeModelClass("En/US","2h 37m","https://images.indianexpress.com/2021/11/spider-man-no-way-home-new-poster-1200.jpg","Spider-Man: No Way Home","2021","Action/Adventure", descriptions().get("Spider-Man: No Way Home").toString(),spideyCastsList(),"https://m.media-amazon.com/images/M/MV5BNzgwNTVjYWQtNTY3YS00NzIzLTg1ZDAtYTA5MDNkNWZhZjA5XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg","https://variety.com/wp-content/uploads/2021/08/spiderman-3.jpg",spideyTrailersList()))
        listItems.add(HomeModelClass("Kn/IN","2h 48m","https://www.bollywoodhungama.com/wp-content/uploads/2022/04/K.G.F-%E2%80%93-Chapter-2-15.jpg","K.G.F: Chapter 2","2022","Action/Drama", descriptions().get("K.G.F: Chapter 2").toString(),kgf2CastsList(),"https://igimages.gumlet.io/tamil/home/kgf2280721_1.jpg?w=376&dpr=2.6","https://www.koimoi.com/wp-content/new-galleries/2022/05/kgf-chapter-2-crosses-1200-crores-globally-0001.jpg",kgf2TrailersList()))
        listItems.add(HomeModelClass("Hi/IN","2h 47m","https://i.ytimg.com/vi/bweRG6WueuM/maxresdefault.jpg","Brahm??stra: Part One ??? Shiva","2022","Fantasy/Adventure", descriptions().get("Brahm??stra: Part One ??? Shiva").toString(),brahmastraCastsList(),"https://s01.sgp1.cdn.digitaloceanspaces.com/article/179585-txqrxkrytn-1662571565.jpg","https://cdn.telanganatoday.com/wp-content/uploads/2021/12/Brahmastra.jpg",brahmastraTrailersList()))
        listItems.add(HomeModelClass("Ta/IN","2h 53m","https://www.koimoi.com/wp-content/new-galleries/2022/05/may-15-audio-release-to-kick-off-buildup-for-kamal-haasan-starrer-vikram-001.jpg","Vikram","2022","Action/Mystery", descriptions().get("Vikram").toString(),vikramCastsList(),"https://resizing.flixster.com/To5a4JmWdugSRb4GCNMx9QsXE2k=/740x380/v2/https://statcdn.fandango.com/MPX/image/NBCU_Fandango/855/203/thumb_69959FD2-7556-4034-9FAD-676685F42179.jpg","https://d2jo35ozacw6sq.cloudfront.net/wp-content/uploads/2022/06/Suriya-in-Vikram-Movie.jpg",vikramTrailersList()))
        return listItems
    }
}