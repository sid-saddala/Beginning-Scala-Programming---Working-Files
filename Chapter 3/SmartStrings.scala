val lyrics = """I see trees or green
                @Red roses too
                @I see them bloom
                @For me and you
                @And I think to myself
                @What a wonderful world""".stripMargin('@')

println(lyrics)

val message = "We are meeting on June 13th of this year, and having lunch at 12:30PM"
val regex = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r

println(regex.findAllIn(message).toList)
