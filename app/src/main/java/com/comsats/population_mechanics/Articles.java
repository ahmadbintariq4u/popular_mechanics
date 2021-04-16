package com.comsats.population_mechanics;

import java.util.ArrayList;

public class Articles {

    int image;
    String title;
    String shortDescription;
    String author;
    String date;
    String description;

    public Articles(int image, String title, String shortDescription, String author, String date, String description) {
        this.image = image;
        this.title = title;
        this.shortDescription = shortDescription;
        this.author = author;
        this.date = date;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Articles> getSampleData(){
        ArrayList<Articles> ArticlessList=new ArrayList<>();

        ArticlessList.add(
                new Articles(
                        R.drawable.img1,
                        "The Pentagon's Hypersonic Weapon System Passes a Critical Flight Test",
                        "The U.S. military is racing to catch up with China and Russia in developing hypersonic weapons.",
                        "KYLE MIZOKAMI",
                        "MAR 24, 2020",
                        "The U.S. military is racing to catch up with China and Russia in developing hypersonic weapons. Hypersonics are weapons that travel faster than Mach 5, up to Mach 20, and represent a different class of weapons than ballistic missiles and their warheads, which travel at speeds of up to Mach 24. The key difference between the two is that hypersonic weapons remain in the atmosphere during flight, while ballistic missile warheads spend much of their flight time in lower earth orbit.\n" + "\n" + "C-HGB will form the basis for hypersonic weapon systems fielded by both the Army and Navy. According to the Department of Defense, C-HGB will comprise a hypersonic weapon’s “conventional warhead, guidance system, cabling, and thermal protection shield.” The weapon is launched into the air on a rocket booster, which then sets it on an atmospheric flight path that sees the weapon roar down onto target at speeds of Mach 5 or faster."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img2,
                        "Army Tanks on Trains Aren’t a Sign of Impending Martial Law",
                        "The U.S. Army ships equipment by train on a regular basis, but the pandemic gives this routine transportation method a more sinister tone.",
                        "KYLE MIZOKAMI",
                        "MAR 24, 2020",
                        "The ongoing spread of the COVID-19 coronavirus has ordinary people concerned that the U.S. military is preparing to lock the country down. People are taking to social media to show videos of tanks and other armored fighting vehicles being shuttled by trains, with many worried and some even speculating it is part of preparations for nationwide martial law.\n" + "\n" + "The movements, while real, are actually part of normal military operations completely unrelated to the viral pandemic or any conspiracy theory. Across America, people are sharing videos of military equipment in civilian areas. The above video shows M1A2 Abrams tanks, M2A3 Bradley infantry fighting vehicles, a M992 field artillery ammunition support vehicle, and a M88A2 Hercules armored recovery vehicle. The presence of all four types of vehicles suggests it is part of a U.S. Army armored brigade combat team."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img3,
                        "This Experimental Drone Could Change America's War Strategy",
                        "Is the Kratos XQ-58A Valkyrie the future of combat aircraft?",
                        "ALEX HOLLINGS",
                        "MAR 17, 2020",
                        "For nearly 20 years, the United States Air Force has been focused on anti-terror operations in uncontested airspace. Now, as America transitions its focus away from the War on Terror toward potential near-peer conflicts, the U.S. is looking to pull a page out of its own World War II playbook by building inexpensive combat aircraft that can overwhelm advanced enemy air defenses through sheer numbers. The Kratos XQ-58A Valkyrie, an unmanned and experimental combat aerial vehicle, is tough to spot on radar and could be directly linked to the F-35 through an encrypted data connection to serve as a wingman under the pilot’s control. But even with these pros, it’s the cost of the Valkyrie, not its capabilities, that could change America’s aerial warfighting strategy.While there’s no question the U.S. boasts the largest air force in the world in terms of total military aircraft, the makeup and size of that force has shifted dramatically since the final days of World War II. At that time, the U.S. boasted some 300,000 combat aircraft. Today, the nation has only around 13,400, spread out across its various military branches. \n\n The reason for this change is the steady progress of technology, which has dramatically increased the combat capabilities and the cost of each aircraft in service today. These parallel developments in aviation production have resulted not only in a leaner, more capable Air Force, but a change in combat strategy altogether. Gone is the World War II mindset that called for superiority through volume. On today’s battlefield, it’s technology, not numbers, that makes the biggest difference."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img4,
                        "NASA Is Building Its Supersonic X-Plane Out of Old Warbirds",
                        "The X-59 aims to pioneer quieter supersonic flight, and NASA is raiding military boneyards for parts.",
                        "KYLE MIZOKAMI",
                        "MAR 16, 2020",
                        "America’s newest x-plane, a jet designed to fly quietly at supersonic speeds, will feature some familiar parts once it takes to the skies. The X-59 Quiet Supersonic Transport (QueSST), under construction by NASA, will feature a number of recycled parts from retired U.S. Air Force planes, including the F-16 Fighting Falcon. QueSST is part of an effort to develop commercial airliners capable of flying supersonic speeds without causing headaches for people living on the ground.\n" + "\n" + "The effort, called the Low Boom Flight Demonstrator Project (LBFD), is being run by NASA to create a plane capable of supersonic flight without rattling windows and disrupting the lives of people on the ground. In the late 1960s, the United States, Soviet Union, and European countries all embarked on efforts to build supersonic commercial transports. The Soviet Union developed the Tupolev Tu-144 and a Franco-British consortium developed the Concorde.\n" + "\n" + "The reason why your last cross-country flight wasn't a supersonic aircraft is because If you a world full of SSTs would be an incredibly noisy one. The Concorde generated 105 perceived decibel levels (PLdB) on the ground traveling at speeds above Mach 1. While most commercial aircraft are inaudible except near airports, an SST would have been noisy throughout its flight route. The Federal Aviation Administration banned commercial supersonic flight over land in 1972, effectively killing off the American commercial supersonic industry and limiting the Concorde to flights to major East Coast airports.\n" + "\n" + "The Low Boom Flight Demonstrator Project hopes to revive commercial supersonic by reducing a jet’s sonic boom. The X-59, according to builder Lockheed Martin, should fly at “55,000 feet at a speed of about 940 mph and create a sound about as loud as a car door closing, 75 Perceived Level decibel (PLdB), instead of a sonic boom.”"
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img5,
                        "What Does the U.S. Military Want with Robot Manta Ray Subs?",
                        "Coming soon to a sea near you.",
                        "COURTNEY LINDER",
                        "MAR 16, 2020",
                        "In the near future, the Defense Advanced Research Projects Agency (DARPA) wants to deploy autonomous submarines that can take on months-long missions without any in-person human logistical support or maintenance.\n" + "\n" + "Earlier this month, DARPA awarded contracts to three companies that will help develop the naval vessels: Lockheed Martin Advanced Technology Laboratories, Northrop Grumman Systems Corporation, and Navatek, LLC. A fourth company, Metron, Inc., is working on solutions specific to undersea energy harvesting techniques that will allow the autonomous subs to seamlessly operate at great depths.\n" + "\n" + "Their work is part of DARPA's new \"Manta Ray\" program, which will advance technology for future unmanned undersea vehicles. The name relates to an artist's mockup of one of these potential subs, which resembles a Manta Ray. With little human support required, DARPA hopes these vessels will eventually become another arrow in combatant commanders' quivers.\n" + "\n" + "\"The Manta Ray program aims to increase at-sea operational capacity and capabilities for the combatant commander while minimizing disruptions to current operations by remaining independent of crewed vessels and ports once deployed,\" Commander Kyle Woerner, program manager for the Manta Ray project in DARPA's Tactical Technology Office, said in a prepared statement. \"If successful, this new class of UUVs would allow operational flexibility and relief of workload for both traditional host ships and servicing ports.\""
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img6,
                        "The U.S. Air Force Wants To Replace the Reaper",
                        "The Reaper is the go-to attack drone for the Air Force (and CIA).",
                        "BY KYLE MIZOKAMI",
                        "MAR 12, 2020",
                        "The U.S. Air Force wants to replace the service’s fleet of Reaper attack drones with something new capable of surviving in hostile airspace. Although highly successful at what it does, the MQ-9 Reaper is easily shot down and would not survive over a battlefield protected by modern air defenses.\n" + "\n" + "The MQ-9 Reaper drone was first introduced in 2007. Bigger, faster, more heavily armed than the original Predator drone, the Reaper has excelled in flying missions over places like Iraq, Afghanistan, Yemen, and Somalia. In uncontested airspace the Reaper can linger for hours, waiting for the right moment to unleash a Hellfire missile or laser-guided bomb. The Reaper is the largest known armed drone in the Pentagon’s inventory. In addition to the Air Force, the CIA operates a small number of Reapers reportedly involved in using the \"Flying Ginsu\" Hellfire R9X missile.\n" + "\n" + "But in contested airspace, it’s a different story. The Reaper lacks the equipment modern warplanes have to keep them alive over the battlefield, including missile warning systems and anti-missile chaff and flares. In particular the insect-looking Reaper lacks stealth, with sensor pods and weapons hanging off wingtips producing a large radar signature. If an enemy missile launches against a Reaper, there’s little the remote pilot can do about it—if he or she even notices the launch."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img7,
                        "The Marines Are Fielding Their Impressive New Grenade Launcher",
                        "The M320 fires faster, farther, and can launch a greater variety of munitions.",
                        "KYLE MIZOKAMI",
                        "MAR 11, 2020",
                        "The U.S. Marine Corps is nearly finished rolling out the service’s new grenade launcher, one that improves on a previous model in practically every way. The M320 grenade launcher can be fired as a standalone weapon or attached to the underside of a M4A1 carbine rifle. For decades, the U.S. military has relied on the M203 launcher to lob grenades beyond throw range. The M203, fitted underneath the barrel of a M16 rifle or M4 carbine, allowed grenadiers to launch high explosive dual purpose (HEDP) grenades to a range of 150 meters against point targets, including armored vehicles or building windows, or 350 meters against area targets like advancing enemy troops. Unlike its predecessor, the M79, the M203 gave soldiers the ability to use both a grenade launcher and a rifle.\n" + "\n" + "It took a long time for the Pentagon to replace the M203, but in 2009, the U.S. Army began deploying the M320, which the German small arms company Heckler and Koch developed."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img8,
                        "Are We Nearing the End of the Supercarrier?",
                        "The supercarrier has become unaffordable. So what comes next?",
                        "KYLE MIZOKAMI",
                        "MAR 12, 2020",
                        "The U.S. Navy could cap its production of Gerald R. Ford-class aircraft carriers at just four ships, with a smaller, cheaper flat top replacing them in the 2030s. The Acting Secretary of the Navy recently cast doubt on the future of the Ford-class, stating that he didn’t know that the service would build more of the Ford ships and he did not know what came next. Increasingly dangerous anti-carrier weapons built by adversaries and the escalating costs and development issues with the ships could lead to smaller, cheaper ships. Acting Secretary of the Navy Thomas Modly, quoted in Defense & Aerospace Report, had this to say about the 1,092-foot-long Gerald R. Ford-class supercarriers:\n" + "\n" + "“I don’t know if we’re going to buy any more of that type,” Modly said, adding that, “we’re certainly thinking about possible other classes. What are we going to learn on these four that’s going to inform what we do next? But we have some time now, we have up until 2026, 2027 before we have to make a really firm decision on what the next carrier is going to look like.”\n" + "The Ford-class carriers are some of the largest carriers ever built. Originally designed to replace the aging USS Enterprise and Nimitz-class carriers, the ships were designed with a host of new technologies, including a new Electromagnetic Aircraft Launch System to fling aircraft into the air, a new Advanced Arresting Gear to bring landing aircraft to a halt, a new radar, and weapons-carrying elevators. The Navy also promised that the new ship would achieve more with less, launching more aircraft sorties and at-sea time with fewer crew and and a significant cost savings over the lifetime of the ship."
                )
        );

        ArticlessList.add(
                new Articles(
                        R.drawable.img9,
                        "The U.S. Military Is on the Frontlines in the Battle Against the Coronavirus",
                        "The outbreak’s spread has resulted in infections and quarantines even as the services mobilize to help battle the virus.",
                        "KYLE MIZOKAMI",
                        "MAR 19, 2020",
                        "The U.S. Military is trying to operate business as usual as much as possible during the coronavirus pandemic, but it’s not proving easy. From Virginia to Australia, the COVID-19 virus is causing friction to ongoing operations, slowing them down or even canceling them altogether. In the meantime soldiers, sailors, pilots, and Marines continue to fall victim to the virus, even as the armed services try to train and prepare for the defense of the nation.\n" + "\n" + "The Department of Defense, sitting on an enormous worldwide supply of medical equipment, announced on March 17 it will supply 2,000 ventilators and five million protective masks to the U.S. Department of Health and Human Services. Secretary of Defense Mark Esper said the masks are “different” from their civilian equivalents and require special training for civilian users. Department of Defense personnel “will likely provide that training.” \n Currently 49 U.S. military personnel around the world have tested positive for the coronavirus, including seven in the U.S. Air Force. Another 14 civilians, 19 dependents, and seven contractors have tested positive, according to Military Times. Eleven of those infected are in hospitals and the rest are in isolation. The number of coronavirus cases in the U.S. Army is unknown, but as of three days ago, the service had only one active duty case in South Korea. The Army has also paused large scale training in the U.S. The Army Corps of Engineers is heading to New York to assist the city, and the White House has said the Corps may renovate empty buildings to house coronavirus patients. It should be pointed out however that unlike the U.S. Navy’s naval construction battalions, or SeaBees, the Corps doesn’t directly work on construction projects, instead issuing contracts that are awarded to civilian contractors. The U.S. Navy is in the process of activating two hospital ships, USNS Mercy and USNS Comfort, with the latter earmarked for deployment to New York City. Cases of COVID-19 have also popped up on ships at sea. Two sailors aboard the amphibious assault ship USS Boxer are infected, as is a sailor aboard the guided missile destroyer USS Ralph Johnson and and a sailor on the littoral combat ship USS Coronado.\n" + "\n" + "Meanwhile, yesterday a U.S. Air Force Globemaster III C-17 transport flew a mission to transport 500,000 COVID-19 test kits from Italy to the U.S. According to Air Force Times, the kits were flown to Memphis International Airport, a FedEx regional hub, where they could be distributed to the rest of the country. The service is reportedly looking at preparing its aeromedical services, in which transports like the C-17 are turned into flying ambulances to move those requiring critical care."
                )
        );

        return ArticlessList;
    }

}
